package com.sparta.sortingAlgorithms;

import com.sparta.algorithmsInterfaces.BubbleSortInterface;

public class BubbleSort implements BubbleSortInterface {


    public int[] sortArray(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        int temp;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 1; j < (arrayLength - i); j++) {
                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    //swap elements
                    temp = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }

    public int[] mergingTwoArrays (int[] array1, int[] array2){
        int arrayLength = array1.length + array2.length;
        int[] mergedArray = new int[arrayLength];
        System.arraycopy(array1,0,mergedArray,0,array1.length);
        System.arraycopy(array2,0,mergedArray,array1.length,array2.length);
        return sortArray(mergedArray);
    }

    public void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
