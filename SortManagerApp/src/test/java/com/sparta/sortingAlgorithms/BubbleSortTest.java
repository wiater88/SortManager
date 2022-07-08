package com.sparta.sortingAlgorithms;


import com.sparta.mvc.model.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void BasicBubbleSortTest() {
        assertArrayEquals(new int[]{1,2,3}, bubbleSort.sortArray(new int[]{3,2,1}));
    }
    @Test
    void negativeNumbersSortTest(){
        assertArrayEquals(new int[]{-333,-121,-15,123,235},bubbleSort.sortArray(new int[]{235,123,-15,-121,-333}));
    }

    @Test
    void emptyListTest(){
        assertNotNull(bubbleSort.sortArray(new int[]{}));
    }

}