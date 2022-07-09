package com.sparta.mvc.model;

import com.sparta.logger.LoggerClass;
import com.sparta.mvc.manager.InputManager;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class ArrayGenerator {

    public static int[] generatingRandomArray(int chosenArrayLength){

        LoggerClass.logTrace("Generating a Random Array");

        Random random = new Random();

        // using a set ensures no duplicates are generated
        Set<Integer> generated = new LinkedHashSet<>();
        while(generated.size() < chosenArrayLength){
            Integer next = random.nextInt(InputManager.MAX_RANDOM_ELEMENT);
            generated.add(next);
        }

        // copy set into an array that is to be sorted
        int[] randomArray = new int[chosenArrayLength];
        int index = 0;
        for(int number : generated) {
            randomArray[index++] = number;
        }

        return randomArray;
    }


}

