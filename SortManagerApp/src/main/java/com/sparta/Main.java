package com.sparta;


import com.sparta.logger.LoggerClass;
import com.sparta.mvc.controller.SortManagerController;

/**
 * Main starting point for application
 */

public class Main {

    public static void main(String[] args) {
        LoggerClass.logTrace("Starting program");
        SortManagerController.start();
        System.exit(0);
    }



    }



