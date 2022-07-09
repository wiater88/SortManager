package com.sparta.mvc.model.binaryTree;


import com.sparta.exceptions.ChildNotFoundException;

/**
 * Binary tree interface
 */

public interface BinaryTree {

    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element);

    int[] getSortedTree();


}
