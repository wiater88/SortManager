package com.sparta.ui;

import java.util.Scanner;

public class SortAlgorithmSelector {

    private int algoNumber;

    public void algoOptionMethod() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nPlease select one of the following sorting algorithms: ");
            System.out.print("\n1) Bubble Sort");
            System.out.print("\n2) Merge Sort");
            System.out.println("\nPlease select number next to algorithm you want to use:  ");
            while (!scanner.hasNextInt()){
                String input = scanner.next();
                System.out.printf("\n \"%s\" is not valid choice. Please try again", input );

            }
            algoNumber = scanner.nextInt();
        } while (algoNumber < 1 || algoNumber > 2);
        System.out.printf("\nYou have selected %s",algoNumber);

    }

    public int getAlgoNumber() {
        return this.algoNumber;
    }
}
