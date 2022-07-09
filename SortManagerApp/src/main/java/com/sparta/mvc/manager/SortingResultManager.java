package com.sparta.mvc.manager;

import com.sparta.logger.LoggerClass;
import com.sparta.mvc.controller.SortingFactory;
import com.sparta.mvc.model.Sorter;

import java.util.ArrayList;
import java.util.List;

public class SortingResultManager {
    private static final int NUMBER_OF_ALGORITHMS = 4;

    private final String algorithmName;
    private final int[] originalArray;
    private final int[] sortedArray;
    private final double sortTime; // milliseconds

    public SortingResultManager(String algorithmName, int[] originalArray, int[] sortedArray, double sortTime) {
        this.algorithmName = algorithmName;
        this.originalArray = originalArray;
        this.sortedArray = sortedArray;
        this.sortTime = sortTime;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public int[] getOriginalArray() {
        return originalArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public double getSortTime() {
        return sortTime;
    }

    public static SortingResultManager runAlgorithm(int chosenAlgorithm, int[] array) {
        int[] unsortedArray = new int[array.length];
        System.arraycopy(array, 0, unsortedArray, 0, array.length);

        LoggerClass.logTrace("Sorting...");


        String algorithmName = SortingFactory.getAlboNames(chosenAlgorithm);
        Sorter sorter = SortingFactory.getAlgoNumber(chosenAlgorithm);
        double start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(array);
        double end = System.nanoTime();
        double sortTime = (end - start) / 1_000_000;

        LoggerClass.logTrace("Preparing results...");

        return new SortingResultManager(algorithmName, unsortedArray, sortedArray, sortTime);
    }

    public static List<SortingResultManager> runAllAlgorithms(int[] array) {
        List<SortingResultManager> resultList = new ArrayList<>();

        LoggerClass.logTrace("Running all algorithms ... ");

        for (int i = 1; i <= NUMBER_OF_ALGORITHMS; i++) {
            resultList.add(runAlgorithm(i, array));
        }

        LoggerClass.logTrace("Sorting completed, preparing results");

        return resultList;
    }
}
