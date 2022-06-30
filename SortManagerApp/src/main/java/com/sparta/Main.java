package com.sparta;

import com.sparta.Unility.PrintArray;
import com.sparta.sortingAlgorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 1, 42, 555};
        int[] array2 = {42, 15, 6};


        BubbleSort bs = new BubbleSort();
        int[] merged = bs.mergingTwoArrays(array1, array2);
        PrintArray.printArray(merged);
    }

}

