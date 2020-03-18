package org.DariaRyabinina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @BeforeClass
    public void beforSimpleclass() {
        LOG.info("Before Simple class complete");
    }

    @AfterClass
    public void afterSimpleClass() {
        LOG.info("After Simple class complete");
    }

    @BeforeMethod
    public void beforeSimpleMethod() {
        LOG.info("Before Simple Method complete");

    }

    @AfterMethod
    public void afterSimpleMethod() {
        LOG.info("After Simple Method complete");
    }

    @Test(dependsOnMethods ="simpleTest2" )
    public void simpleTest1() {
        LOG.info("Simple Test1 complete");

    }

    @Test
    public void simpleTest2() {
        LOG.info("Simple Test2 complete");


    }
}
