package bt.collections;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.collections.graphs.TestGraphIndirected;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestSetNatural.class,
	TestStackNatural.class,
	TestOneDimTable.class,
	TestOneDimTableNatural_Imperative.class,
	TestOneDimTableNatural_Object.class,
	TestGraphIndirected.class,
	TestTuple.class
})

public class AllTests{

}
