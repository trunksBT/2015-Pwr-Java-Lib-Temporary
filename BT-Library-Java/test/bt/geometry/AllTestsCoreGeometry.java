package bt.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.geometry.elementaries.TestLineSegment;
import bt.geometry.elementaries.TestPoint;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestLineSegment.class,
	TestPoint.class
})

public class AllTestsCoreGeometry{

}
