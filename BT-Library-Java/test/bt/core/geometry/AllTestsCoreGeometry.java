package bt.core.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.core.geometry.elementaries.TestLineSegment;
import bt.core.geometry.elementaries.TestPoint;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestLineSegment.class,
	TestPoint.class
})

public class AllTestsCoreGeometry{

}
