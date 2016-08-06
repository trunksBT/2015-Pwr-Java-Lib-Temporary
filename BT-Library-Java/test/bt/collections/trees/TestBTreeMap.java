package bt.collections.trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import bt.algorithms.comparators.NaturalComparator;
import bt.collections.interfaces.Map;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestBTreeMap extends TestAbstractMap {
    protected Map createMap() {
        return new BTreeMap(NaturalComparator.INSTANCE, 2);
    }
}
