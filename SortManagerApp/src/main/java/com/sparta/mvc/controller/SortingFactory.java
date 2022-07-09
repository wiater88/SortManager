package com.sparta.mvc.controller;

import com.sparta.mvc.model.*;

public class SortingFactory {

    public static Sorter getAlgoNumber(int algoNumber) {
        return switch (algoNumber) {
            case 1 -> new BubbleSort();
            case 2 -> new MergeSort();
            case 3 -> new BinaryTreeSort();
            default -> new QuickSort();
        };
    }

    public static String getAlboNames(int algoNumber) {
        return switch (algoNumber) {
            case 1 -> "Bubble Sort";
            case 2 -> "Merge Sort";
            case 3 -> "Binary Tree Sort";

            default -> "Quick Sort";
        };
    }
}
