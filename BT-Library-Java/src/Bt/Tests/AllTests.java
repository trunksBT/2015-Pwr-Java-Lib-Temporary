package Bt.Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Bt.Tests.Collections.TestQueueNatural;
import Bt.Tests.Core.Geometry.AllTestsCoreGeometry;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestQueueNatural.class,
	AllTestsCoreGeometry.class
})

public class AllTests{

}
