package Bt.Tests.Core.Geometry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Bt.Tests.Core.Geometry.Elementaries.TestLineSegment;
import Bt.Tests.Core.Geometry.Elementaries.TestPoint;
import Bt.Tests.Core.Geometry.Shapes.TestGeometria;
import Bt.Tests.Core.Geometry.Shapes.TestGeometriaIO_Test_Version;
import Bt.Tests.Core.Geometry.Shapes.TestShapes;

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
