package bt.test.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.test.geometry.elementaries.TestLineSegment;
import bt.test.geometry.elementaries.TestPoint;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestLineSegment.class,
	TestPoint.class
})

public class AllTestsCoreGeometry{

}