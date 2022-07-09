package com.sparta.mvc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    MergeSort ms = new MergeSort();
    int[] unsortedArray = {1,5,3,7,2};
    int[] sortArray = {1,2,3,5,7};


    @Test
    void basicMergeSortTest() {
        assertArrayEquals(sortArray, ms.sortArray(unsortedArray));
    }
    @Test
    void negativeNumbersSortTest(){
        assertArrayEquals(new int[]{-333,-121,-15,123,235}, ms.sortArray(new int[]{235,123,-15,-121,-333}));
    }


}

