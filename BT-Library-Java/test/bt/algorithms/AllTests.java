package bt.algorithms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.algorithms.Test_GraphAlgos_String_Double;
import bt.algorithms.Test_GraphAlgos_String_String;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test_GraphAlgos_String_String.class,
	Test_GraphAlgos_String_Double.class
})

public class AllTests{

}