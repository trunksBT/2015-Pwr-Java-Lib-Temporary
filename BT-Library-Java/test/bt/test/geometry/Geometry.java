package bt.test.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.test.geometry.elementaries.TestLineSegment;
import bt.test.geometry.elementaries.TestPoint;
import bt.test.geometry.shapes.TestGeometria;
import bt.test.geometry.shapes.TestGeometriaIO_Test_Version;
import bt.test.geometry.shapes.TestShapes;

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
