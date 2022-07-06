package com.sparta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger logger = LogManager.getLogger("My Logger"); // load property file
    public static void main(String[] args) {
        logger.info("First log");
     Loader loader = new Loader();
     loader.run();


    }

}

