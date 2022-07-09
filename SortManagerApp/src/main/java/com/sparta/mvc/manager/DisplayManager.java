package com.sparta.mvc.manager;

import com.sparta.logger.LoggerClass;

import java.util.Arrays;
import java.util.List;

public class DisplayManager {

    public static void displaySortingResults(SortingResultManager sortingResultManager){
        LoggerClass.logTrace("Displaying all results");
        System.out.println("Original Array: " + Arrays.toString(sortingResultManager.getOriginalArray()));
        System.out.println("Algorithm Used: " + sortingResultManager.getAlgorithmName());
        System.out.println("Sorted Array: " + Arrays.toString(sortingResultManager.getSortedArray()));
        System.out.format("Time taken: %.5f ms\n", sortingResultManager.getSortTime());
    }

    public static void displayAllAlgorithmTimes(List<SortingResultManager> sortingResultManagers) throws IndexOutOfBoundsException{
        int[] originalArray = sortingResultManagers.get(0).getOriginalArray();
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("-------------------------------------------------------");
        System.out.println("Sorting Algorithms' Times over " + originalArray.length + " elements");
        System.out.println("-------------------------------------------------------");
        sortingResultManagers.sort((algorithm1, algorithm2)
                -> (int) (1_000_000_000 * (algorithm1.getSortTime() - algorithm2.getSortTime())));
        int ranking = 1;
        for(SortingResultManager sortingResultManager : sortingResultManagers){
            System.out.format("%d. %s: %.5f ms\n",
                    ranking, sortingResultManager.getAlgorithmName(), sortingResultManager.getSortTime());
            ranking++;
        }
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void displayEndOfARequest(){
        System.out.println("\n==============================================================\n");

    }
}
