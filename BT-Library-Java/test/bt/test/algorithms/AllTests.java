package bt.test.algorithms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.test.algorithms.Test_GraphAlgos_String_Double;
import bt.test.algorithms.Test_GraphAlgos_String_String;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test_GraphAlgos_String_String.class,
	Test_GraphAlgos_String_Double.class
})

public class AllTests{

}
