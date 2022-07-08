package com.sparta.mvc.controller;

import com.sparta.mvc.model.Sorter;
import com.sparta.mvc.model.BubbleSort;
import com.sparta.mvc.model.MergeSort;
import com.sparta.mvc.model.QuickSort;

public class SortingFactory {

    public static Sorter getAlgoNumber(int algoNumber) {
        return switch (algoNumber) {
            case 1 -> new BubbleSort();
            case 2 -> new MergeSort();
            default -> new QuickSort();
        };
    }

    public static String getAlboNames(int algoNumber) {
        return switch (algoNumber) {
            case 1 -> "Bubble Sort";
            case 2 -> "Merge Sort";
            default -> "Quick Sort";
        };
    }
}
