package com.sparta.mvc.model;


import com.sparta.mvc.model.binaryTree.BinaryTreeImplementation;


public class BinaryTreeSort implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation(arrayToSort);
        return binaryTree.getSortedTree();
    }
}
