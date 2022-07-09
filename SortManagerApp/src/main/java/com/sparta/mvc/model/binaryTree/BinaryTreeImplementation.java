package com.sparta.mvc.model.binaryTree;


import com.sparta.exceptions.ChildNotFoundException;
import com.sparta.exceptions.ExceptionConstants;

import java.util.Objects;

public class BinaryTreeImplementation implements BinaryTree {

        private static class Node {

            private final int value;
            private Node leftChild;
            private Node rightChild;

            private Node(int value) {
                this.value = value;
            }

            private void createLeftNode(int value) {
                leftChild = new Node(value);
            }

            private void createRightNode(int value) {
                rightChild = new Node(value);
            }

            private int getValue() {
                return value;
            }

            private Node getLeftChild() {
                return leftChild;
            }

            private void setLeftChild(Node leftChild) {
                this.leftChild = leftChild;
            }

            private Node getRightChild() {
                return rightChild;
            }

            private void setRightChild(Node rightChild) {
                this.rightChild = rightChild;
            }

            private boolean isLeftNodeEmpty() {
                return leftChild == null;
            }

            private boolean isRightNodeEmpty() {
                return rightChild == null;
            }
        }

    private final Node rootNode;
    private int nodeCount = 1;
    private int index;
    private int[] sortedTree;

    public BinaryTreeImplementation(final int value) {
        rootNode = new Node(value);
    }

    public BinaryTreeImplementation(final int[] array) {
        rootNode = new Node(array[0]);
        for (int i = 1; i < array.length; i++) {
            addElement(array[i]);
        }
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return nodeCount;
    }

    @Override
    public void addElement(int element) {
        addElementHelper(rootNode, element);
    }

    private void addElementHelper(Node node, int element){
        if(element == node.getValue()) return; // already exists, can't have duplicates
        if(element < node.getValue()){
            if(node.isLeftNodeEmpty()){
                node.setLeftChild(new Node(element));
                nodeCount++;
            }
            else{
                addElementHelper(node.getLeftChild(), element);
            }
        }
        else {
            if (node.isRightNodeEmpty()) {
                node.setRightChild(new Node(element));
                nodeCount++;
            }
            else{
                addElementHelper(node.getRightChild(), element);
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        return (getNodeHelper(value) != null);
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = getNodeHelper(element);
        if(node != null) return node.getValue();
        throw new ChildNotFoundException(ExceptionConstants.CHILD_NOT_FOUND);
    }

    @Override
    public int getRightChild(int element)  {
        return (Objects.requireNonNull(getNodeHelper(element)).getRightChild().getValue());
    }

    private Node getNodeHelper(int element){
        Node node = rootNode;
        while(node != null){
            if(element == node.getValue()) return node;
            if (element < node.getValue()) node = node.getLeftChild();
            else{
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int[] getSortedTree() {
        sortedTree = new int[nodeCount];
        index = 0;
        sortHelper(rootNode);
        return sortedTree;
    }

    private void sortHelper(Node node){
        if(!node.isLeftNodeEmpty()) sortHelper(node.getLeftChild());
        sortedTree[index++] = node.getValue();
        if(!node.isRightNodeEmpty()) sortHelper(node.getRightChild());
    }

}
