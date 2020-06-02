package com.technosmithlabs.loglombokconfig.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


@Component
public class LoggingUsingClassicalWay {
    // below we are explicitly writing the code to get the logger object and then using
    // it in our code.
    private static final Logger LOG = LogManager.getLogger(LoggingUsingClassicalWay.class);

    public void testLogFunctionality() {
        LOG.info("Hello World!");
        LOG.info("This is the info logging");
        LOG.debug("This is the debug logging");
        LOG.error("This is the error logging");
    }
}
