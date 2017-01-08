package bt.algorithms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.algorithms.graphs.Test_GraphAlgos_String_Double;
//import bt.algorithms.graphs.Test_GraphAlgos_String_Double_2;
import bt.algorithms.graphs.Test_GraphAlgos_String_String;
//import bt.algorithms.graphs.Test_GraphAlgos_String_String_2;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test_GraphAlgos_String_String.class,
	Test_GraphAlgos_String_Double.class
//	Test_GraphAlgos_String_String_2.class,
//	Test_GraphAlgos_String_Double_2.class
})

public class AllTests{

}
