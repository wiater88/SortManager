package com.sparta;

import com.sparta.ui.ArraySizeSelector;
import com.sparta.ui.SortAlgorithmSelector;
import com.sparta.utility.RandomGenerator;
import com.sparta.utility.Utility;

public class Loader {


    public void run() {
        SortAlgorithmSelector algorithmSelector = new SortAlgorithmSelector();
        ArraySizeSelector arraySizeSelector = new ArraySizeSelector();
        RandomGenerator randomGenerator = new RandomGenerator();

        algorithmSelector.algoOptionMethod();//getting algorithm
        arraySizeSelector.arraySizeMethod(); // getting size of array
        int[] generatedArray = new int[arraySizeSelector.getArraySize()];
        randomGenerator.randomArrayGenerator(generatedArray.length,generatedArray);
        System.out.println("\nRandom created array : ");
        Utility.printArray(generatedArray);


    }
}

