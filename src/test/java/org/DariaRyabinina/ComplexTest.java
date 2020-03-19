package org.DariaRyabinina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class ComplexTest {
    private static final Logger LOG = LoggerFactory.getLogger(ComplexTest.class);


    @DataProvider(name = "Name")

    private Object[][] dataProvider() {
        return new Object[][]{{"Василий", 25}, {"Николай", 30}};
    }

    @Test(groups = "testing", dataProvider = "Name")
    public void paramTest(String name, int age) {
        String output = String.format("Name: '%s' | Age: '%d'", name, age);
        LOG.info(output);
    }

}
