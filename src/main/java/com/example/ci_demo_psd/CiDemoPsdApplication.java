package com.example.ci_demo_psd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CiDemoPsdApplication {

    private static final Logger logger = LoggerFactory.getLogger(CiDemoPsdApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CiDemoPsdApplication.class, args);
        logger.info("This is the main method");
    }

}
