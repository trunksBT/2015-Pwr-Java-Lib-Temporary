package Bt.Tests.Core.Algorithms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Bt.Tests.Core.Algorithms.Test_GraphAlgos_String_Double;
import Bt.Tests.Core.Algorithms.Test_GraphAlgos_String_String;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test_GraphAlgos_String_String.class,
	Test_GraphAlgos_String_Double.class
})

public class AllTests{

}
