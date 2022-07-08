package com.sparta.mvc.controller;

import com.sparta.exceptions.ChoiceOutOfBoundsException;
import com.sparta.exceptions.ExceptionConstants;
import com.sparta.exceptions.InvalidArraySizeException;
import com.sparta.exceptions.SortManagerInputException;
import com.sparta.logger.LoggerClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    private static final int EXIT = 6;
    public static final int MAX_ARRAY_SIZE = 1_000;

    public static final int MAX_RANDOM_ELEMENT = 10_000;

    public static int scanForChosenAlgorithm(){

        LoggerClass.logTrace("User input for Algorithm selection");

        Scanner scanner = new Scanner(System.in);
        int chosenAlgorithm;
        do {
            //TODO Needs to be implemented
            DisplayManager.displayMessage
                    ("""

                            ==============================================================

                             Sort Manager - Please select your desired sorting algorithm
                              1. Bubble Sort
                              2. Merge Sort
                              3. Binary Sort\s
                              4. Quick Sort
                              5. Display Algorithms' Compared Speeds
                              6. Exit Sort Manager
                             Your Choice:\s""");

            try {
                chosenAlgorithm = scanner.nextInt();
                if (chosenAlgorithm < 1 || chosenAlgorithm > EXIT) {
                    throw new ChoiceOutOfBoundsException("Your chosen input is out of bounds. " +
                            "Please choose a number between 1 and " + EXIT);
                }
            } catch (InputMismatchException ime) {
                chosenAlgorithm = 0;
                LoggerClass.logError(ExceptionConstants.NON_INTEGER_INPUT);
                scanner.nextLine();
            } catch (Exception e) {
                chosenAlgorithm = 0;
                DisplayManager.displayMessage(e.getMessage());
            }
        } while (chosenAlgorithm == 0);

        return chosenAlgorithm;
    }

    public static int scanForChosenArrayLength(){

        LoggerClass.logTrace("Scanning for Array Length");

        Scanner scanner = new Scanner(System.in);
        int chosenArrayLength;

        do{
            DisplayManager.displayMessage(
                    "--------------------------------------------------------------------------------------"
                            + "\nPlease specify size of array you want to create? " +
                            "Array must be minimum size of 1 and maximum of " + MAX_ARRAY_SIZE +
                            "\n Your Choice of Array Length: ");

            try{
                chosenArrayLength = scanner.nextInt();
                if (chosenArrayLength == 0) {
                    throw new SortManagerInputException(ExceptionConstants.ARRAY_LENGTH_ZERO);
                } else if (chosenArrayLength   < 0) {
                    throw new SortManagerInputException(ExceptionConstants.ARRAY_LENGTH_NEGATIVE);
                }else if(chosenArrayLength >= InputManager.MAX_ARRAY_SIZE) {
                    throw new InvalidArraySizeException(ExceptionConstants.ARRAY_LENGTH_BEYOND_LIMIT);
                }
            } catch (NegativeArraySizeException nase) {
                chosenArrayLength = 0;
                LoggerClass.logError(ExceptionConstants.ARRAY_LENGTH_NEGATIVE);
            } catch (InputMismatchException ime) {
                chosenArrayLength = 0;
                LoggerClass.logError(ExceptionConstants.NON_INTEGER_INPUT);
                scanner.nextLine();
            } catch (Exception | InvalidArraySizeException e) {
                chosenArrayLength = 0;
                LoggerClass.logError(e.getMessage());
            }


        } while (chosenArrayLength < 1);

        return chosenArrayLength;
    }
}
