package bt.tests.core.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.tests.core.geometry.elementaries.TestLineSegment;
import bt.tests.core.geometry.elementaries.TestPoint;
import bt.tests.core.geometry.shapes.TestGeometria;
import bt.tests.core.geometry.shapes.TestGeometriaIO_Test_Version;
import bt.tests.core.geometry.shapes.TestShapes;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestLineSegment.class,
	TestPoint.class,
	TestShapes.class,
	TestGeometria.class,
	TestGeometriaIO_Test_Version.class,	
})

public class Geometry{

}
