package com.sparta.mvc.controller;

import com.sparta.logger.LoggerClass;
import com.sparta.mvc.manager.DisplayManager;
import com.sparta.mvc.manager.InputManager;
import com.sparta.mvc.manager.SortingResultManager;
import com.sparta.mvc.model.ArrayGenerator;

import java.util.List;

public class SortManagerController {
    private final static int COMPARE_ALL_ALGORITHMS_PERFORMANCE = 5;
    private final static int EXIT_PROGRAM = 6;

    public static void start() {

        LoggerClass.logTrace("Starting CLI");

        int chosenAlgorithm;
        int chosenArrayLength;
        int[] generatedArray;

        try {
            LoggerClass.logTrace("Starting do-while loop inside try-catch block in SortManagerRunner");
            do {
                chosenAlgorithm = InputManager.scanForChosenAlgorithm();

                if (chosenAlgorithm != EXIT_PROGRAM) {
                    chosenArrayLength = InputManager.scanForChosenArrayLength();
                    generatedArray = ArrayGenerator.generatingRandomArray(chosenArrayLength);

                    if (chosenAlgorithm == COMPARE_ALL_ALGORITHMS_PERFORMANCE) {
                        List<SortingResultManager> algorithmTimesList = SortingResultManager.runAllAlgorithms(generatedArray);
                        DisplayManager.displayAllAlgorithmTimes(algorithmTimesList);
                    } else {
                        SortingResultManager sortingResultManager = SortingResultManager.runAlgorithm(chosenAlgorithm, generatedArray);
                        DisplayManager.displaySortingResults(sortingResultManager);
                    }
                }

                DisplayManager.displayEndOfARequest();

            } while (chosenAlgorithm != EXIT_PROGRAM);
            LoggerClass.logTrace("Ending do-while loop inside try-catch block in SortManagerRunner");
        } catch (IndexOutOfBoundsException e){
            LoggerClass.logError(e.getMessage());
        } catch (Exception e){
            LoggerClass.logError(e.getMessage());
            System.exit(1);
        }
        LoggerClass.logTrace("Exiting CLI");
        System.out.println("Thanks for using Sorter App, hope to see you soon ");
    }

}
