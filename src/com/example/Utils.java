package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    public static void logMessage(String message) {
        logger.info("Logging message: {}", message);
    }

    public static void logError(String error) {
        logger.error("Error occurred: {}", error);
    }
}
