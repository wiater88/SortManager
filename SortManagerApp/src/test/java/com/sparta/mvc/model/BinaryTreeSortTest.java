package com.sparta.mvc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeSortTest {

    BinaryTreeSort bs = new BinaryTreeSort();
    int[] unsortedArray = {1,5,3,7,2};
    int[] sortArray = {1,2,3,5,7};


    @Test
    void BasicBubbleSortTest() {
        assertArrayEquals(sortArray, bs.sortArray(unsortedArray));
    }
    @Test
    void negativeNumbersSortTest(){
        assertArrayEquals(new int[]{-333,-121,-15,123,235}, bs.sortArray(new int[]{235,123,-15,-121,-333}));
    }


    }

