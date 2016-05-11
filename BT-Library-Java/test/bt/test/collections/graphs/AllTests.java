package bt.test.collections.graphs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.test.algorithms.Test_GraphAlgos_String_Double;
import bt.test.algorithms.Test_GraphAlgos_String_String;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test_DirtyEdgeDecorator.class,
	Test_Edge.class,
	Test_GraphAdjacentList.class,
	Test_GraphAdjacentMatrix.class,
	Test_GraphEdgeList.class
})

public class AllTests{

}
