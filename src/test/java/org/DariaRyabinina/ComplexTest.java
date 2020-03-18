package org.DariaRyabinina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class ComplexTest {
    private static final Logger LOG = LoggerFactory.getLogger(ComplexTest.class);

    @BeforeClass
    public void beforComplexclass() {
        LOG.info("BeforComplexclass complete");
    }

    @AfterClass
    public void afterComplexClass() {
        LOG.info("After Complex class complete");
    }

    @BeforeMethod
    public void beforeComplexMethod() {
        LOG.info("Before Complex Method  complete");

    }

    @AfterMethod
    public void afterComplexMethod() {
        LOG.info("After ComplexMethod  complete");

    }

    @BeforeSuite
    public void beforeSuite() {
        LOG.info("Before Suite complete");

    }

    @Test(enabled = false)
    public void complexTest1() {
        LOG.info("ComplexTest1 complete");

    }

    @Test
    public void complexTest2() {

        LOG.info("ComplexTest2 complete");
    }

    @DataProvider(name="Name")

    private Object[][] dataProvider(){
        return new Object[][]{{"Василий", 25},{"Николай",30}};
    }

    @Test(dataProvider="Name")
    public void paramTest(String name, int age){
String output= String.format("Name: '%s' | Age: '%d'", name, age);
LOG.info(output);
    }

    @AfterSuite
    public void afterSuite() {
        LOG.info("After Suite complete");
    }
}
