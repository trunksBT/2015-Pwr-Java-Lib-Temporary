package Bt.Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Bt.Tests.Core.Collections.AllTestsCollections;
import Bt.Tests.Core.Geometry.AllTestsCoreGeometry;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AllTestsCollections.class,
	AllTestsCoreGeometry.class
})

public class AllTests{

}