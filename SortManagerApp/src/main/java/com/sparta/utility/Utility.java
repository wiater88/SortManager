package com.sparta.utility;

public class Utility {
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static int[] mergingTwoArrays(int[] array1, int[] array2) {
        int arrayLength = array1.length + array2.length;
        int[] mergedArray = new int[arrayLength];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }
}
