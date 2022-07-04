package com.sparta;

import com.sparta.Interfaces.Sorter;
import com.sparta.sortingAlgorithms.MergeSort;
import com.sparta.utility.Utility;
import com.sparta.sortingAlgorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 1, 42, 555};
        int[] array2 = {42, 15, 6};

        int[] array3 = {5, 2, 1, 42, 555};
        int[] array4 = {42, 15, 6};
        System.out.println("Bubble Sort");
        Sorter bs = new BubbleSort();
        bs.sortArray(array1);
        bs.sortArray(array2);
        int[] merged = Utility.mergingTwoArrays(array1, array2);
        bs.sortArray(merged);

        Utility.printArray(merged);
        System.out.println("Merge Sort");
        Sorter sorter = new MergeSort();
        sorter.sortArray(array3);
        sorter.sortArray(array4);
        int[] merged2 = Utility.mergingTwoArrays(array3,array4);
        sorter.sortArray(merged2);
        Utility.printArray(merged2);

    }

}

