package com.sparta.ui;

import java.util.Scanner;

// class to define size of array
public class ArraySizeSelector {

    private int arraySize;

    public void arraySizeMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease select size of array you would like to create: ");
            do {
                System.out.println("\nPlease enter valid number (needs to be greater then 1)");
                while (!scanner.hasNextInt()){
                    String input = scanner.next();
                    System.out.printf("\n \"%s\" is not valid choice. Please try again", input );

                }
                arraySize = scanner.nextInt();
            } while (arraySize < 2);
        System.out.printf("\nArray size \"%s\" has been created",arraySize);

    }

    public int getArraySize() {
        return this.arraySize;
    }
}
