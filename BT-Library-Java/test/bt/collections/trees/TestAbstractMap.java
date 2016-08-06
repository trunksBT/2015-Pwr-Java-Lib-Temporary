package bt.collections.trees;

import bt.collections.interfaces.IEntry;
import bt.collections.interfaces.List;
import bt.collections.interfaces.Map;
import bt.collections.iterators.Iterator;
import bt.collections.iterators.ReverseIterator;
import bt.collections.lists.LinkedList;
import bt.exceptions.IteratorOutOfBoundsException;
import junit.framework.TestCase;

public abstract class TestAbstractMap extends TestCase {
    private static final IEntry A = new BEntry("akey", "avalue");
    private static final IEntry B = new BEntry("bkey", "bvalue");
    private static final IEntry C = new BEntry("ckey", "cvalue");
    private static final IEntry D = new BEntry("dkey", "dvalue");
    private static final IEntry E = new BEntry("ekey", "evalue");
    private static final IEntry F = new BEntry("fkey", "fvalue");

    private Map _map;

    protected void setUp() throws Exception {
        super.setUp();

        _map = createMap();

        _map.set(C.getKey(), C.getVal());
        _map.set(A.getKey(), A.getVal());
        _map.set(B.getKey(), B.getVal());
        _map.set(D.getKey(), D.getVal());
    }

    protected abstract Map createMap();

    public void testContainsExisting() {
        assertTrue(_map.contains(A.getKey()));
        assertTrue(_map.contains(B.getKey()));
        assertTrue(_map.contains(C.getKey()));
        assertTrue(_map.contains(D.getKey()));
    }

    public void testContainsNonExisting() {
        assertFalse(_map.contains(E.getKey()));
        assertFalse(_map.contains(F.getKey()));
    }

    public void testGetExisting() {
        assertEquals(A.getVal(), _map.get(A.getKey()));
        assertEquals(B.getVal(), _map.get(B.getKey()));
        assertEquals(C.getVal(), _map.get(C.getKey()));
        assertEquals(D.getVal(), _map.get(D.getKey()));
    }

    public void testGetNonExisting() {
        assertNull(_map.get(E.getKey()));
        assertNull(_map.get(F.getKey()));
    }

    public void testSetNewKey() {
        assertEquals(4, _map.size());

        assertNull(_map.set(E.getKey(), E.getVal()));
        assertEquals(E.getVal(), _map.get(E.getKey()));
        assertEquals(5, _map.size());

        assertNull(_map.set(F.getKey(), F.getVal()));
        assertEquals(F.getVal(), _map.get(F.getKey()));
        assertEquals(6, _map.size());
    }

    public void testSetExistingKey() {
        assertEquals(4, _map.size());
        assertEquals(C.getVal(), _map.set(C.getKey(), "cvalue2"));
        assertEquals("cvalue2", _map.get(C.getKey()));
        assertEquals(4, _map.size());
    }

    public void testDeleteExisting() {
        assertEquals(4, _map.size());

        assertEquals(B.getVal(), _map.delete(B.getKey()));
        assertFalse(_map.contains(B.getKey()));
        assertEquals(3, _map.size());

        assertEquals(A.getVal(), _map.delete(A.getKey()));
        assertFalse(_map.contains(A.getKey()));
        assertEquals(2, _map.size());

        assertEquals(C.getVal(), _map.delete(C.getKey()));
        assertFalse(_map.contains(C.getKey()));
        assertEquals(1, _map.size());

        assertEquals(D.getVal(), _map.delete(D.getKey()));
        assertFalse(_map.contains(D.getKey()));
        assertEquals(0, _map.size());
    }

    public void testDeleteNonExisting() {
        assertEquals(4, _map.size());
        assertNull(_map.delete(E.getKey()));
        assertEquals(4, _map.size());
        assertNull(_map.delete(F.getKey()));
        assertEquals(4, _map.size());
    }

    public void testClear() {
        assertEquals(4, _map.size());
        assertFalse(_map.isEmpty());

        _map.clear();

        assertEquals(0, _map.size());
        assertTrue(_map.isEmpty());

        assertFalse(_map.contains(A.getKey()));
        assertFalse(_map.contains(B.getKey()));
        assertFalse(_map.contains(C.getKey()));
        assertFalse(_map.contains(D.getKey()));
    }

    public void testIteratorForwards() {
        checkIterator(_map.iterator());
    }

    public void testIteratorBackwards() {
        checkIterator(new ReverseIterator(_map.iterator()));
    }

    private void checkIterator(Iterator i) {
        List entries = new LinkedList();

        for (i.first(); !i.isDone(); i.next()) {
            IEntry entry = (IEntry) i.current();
            entries.add(new BEntry(entry.getKey(), entry.getVal()));
        }

        assertEquals(4, entries.size());
        assertTrue(entries.contains(A));
        assertTrue(entries.contains(B));
        assertTrue(entries.contains(C));
        assertTrue(entries.contains(D));
    }
}
