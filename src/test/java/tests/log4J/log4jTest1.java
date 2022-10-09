package tests.log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class log4jTest1 {
    private static Logger logger= LogManager.getLogger(log4jTest1.class.getName());

    @Test
    public void Log4jTest1() {
        logger.info("LOG INFO");
        logger.debug("LOG DEBUG");
        logger.error("LOG EROR");
        logger.fatal("LOG FATAL");
    }
}
