package bt.tests.core.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.tests.core.geometry.elementaries.TestLineSegment;
import bt.tests.core.geometry.elementaries.TestPoint;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestLineSegment.class,
	TestPoint.class
})

public class AllTestsCoreGeometry{

}
