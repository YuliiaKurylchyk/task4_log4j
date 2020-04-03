package com.kurylchyk;
import org.apache.logging.log4j.*;


public class Application {
    private static Logger logger1 = LogManager.getLogger(Application.class);

    public static void main(String[] args) {

        logger1.trace("This is trace message");
        logger1.debug("This is debug message");
        logger1.info("This is info message");
        logger1.warn("This is warn message");
        logger1.error("This is error message");
        logger1.fatal("This is fatal message");

    }
}
