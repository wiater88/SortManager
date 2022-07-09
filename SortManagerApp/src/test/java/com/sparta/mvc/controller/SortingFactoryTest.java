package com.sparta.mvc.controller;

import com.sparta.mvc.model.BinaryTreeSort;
import com.sparta.mvc.model.BubbleSort;
import com.sparta.mvc.model.MergeSort;
import com.sparta.mvc.model.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingFactoryTest {

    @Test
    void correctAlgorithmSelectionTest() {
        Assertions.assertEquals(MergeSort.class,SortingFactory.getAlgoNumber(2).getClass());
        Assertions.assertEquals(BubbleSort.class,SortingFactory.getAlgoNumber(1).getClass());
        Assertions.assertEquals(BinaryTreeSort.class,SortingFactory.getAlgoNumber(3).getClass());
        Assertions.assertEquals(QuickSort.class,SortingFactory.getAlgoNumber(4).getClass());
    }

    @Test
    void correctNameTest() {
        Assertions.assertEquals("Merge Sort",SortingFactory.getAlboNames(2));
        Assertions.assertEquals("Bubble Sort",SortingFactory.getAlboNames(1));
        Assertions.assertEquals("Binary Tree Sort",SortingFactory.getAlboNames(3));
        Assertions.assertEquals("Quick Sort",SortingFactory.getAlboNames(4));
    }
}