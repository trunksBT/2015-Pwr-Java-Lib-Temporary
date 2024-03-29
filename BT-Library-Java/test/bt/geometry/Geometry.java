package bt.geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import bt.geometry.elementaries.TestLineSegment;
import bt.geometry.elementaries.TestPoint;
import bt.geometry.shapes.TestGeometria;
import bt.geometry.shapes.TestGeometriaIO_Test_Version;
import bt.geometry.shapes.TestShapes;

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
