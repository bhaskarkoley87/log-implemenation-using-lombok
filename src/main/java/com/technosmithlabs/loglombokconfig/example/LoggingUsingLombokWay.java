package com.technosmithlabs.loglombokconfig.example;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
// This is the log4j2 annotation that you will use, and that's it.
@Log4j2
public class LoggingUsingLombokWay {
    public void testLogFunctionality() {
        log.info("Hello World!");
        log.info("This is the info logging");
        log.debug("This is the debug logging");
        log.error("This is the error logging");
    }
}
