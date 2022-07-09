package com.sparta.mvc.model;

/***
 * Class implementation of bubble sort algorithm
 */

public class BubbleSort implements Sorter {


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


    }




