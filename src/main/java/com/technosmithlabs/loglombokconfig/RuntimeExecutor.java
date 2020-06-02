package com.technosmithlabs.loglombokconfig;

import com.technosmithlabs.loglombokconfig.example.LoggingUsingClassicalWay;
import com.technosmithlabs.loglombokconfig.example.LoggingUsingLombokWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuntimeExecutor implements CommandLineRunner {

    @Autowired
    LoggingUsingClassicalWay classicalApproach;

    @Autowired
    LoggingUsingLombokWay lombokApproach;

    @Override
    public void run(String... args) throws Exception {
        // logging using classical approach.
        classicalApproach.testLogFunctionality();
        // logging using lombok approach.
        lombokApproach.testLogFunctionality();
    }
}
