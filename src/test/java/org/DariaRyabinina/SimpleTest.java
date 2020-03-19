package org.DariaRyabinina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @Test
    public void simpleTest1() {
        LOG.info("Simple Test1 complete");
    }

}
