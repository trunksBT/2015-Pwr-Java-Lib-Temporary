package bt.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.tests.core.algorithms.Test_GraphAlgos_String_Double;
import bt.tests.core.algorithms.Test_GraphAlgos_String_String;
import bt.tests.core.collections.Collections;
import bt.tests.core.geometry.Geometry;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Collections.class,
	Geometry.class,
	Test_GraphAlgos_String_String.class,
	Test_GraphAlgos_String_Double.class
})

public class AllTests{

}