package com.azizkale.junittestingproject.package1;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MathsTest.class, ExampleTestMethodOrder.class, SquareAreaCalculatingTest.class})
public class ExampleSuiteTest {
    // This is an empty class, no additional code is needed.
}