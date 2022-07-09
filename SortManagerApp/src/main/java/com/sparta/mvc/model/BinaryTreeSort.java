package com.sparta.mvc.model;


import com.sparta.mvc.model.binaryTree.BinaryTreeImplementation;

/**
 * Adapter design patter class for Binary Sort
 */

public class BinaryTreeSort implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation(arrayToSort);
        return binaryTree.getSortedTree();
    }
}
