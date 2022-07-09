package com.sparta.mvc.model;

import com.sparta.exceptions.ExceptionConstants;
import com.sparta.exceptions.InvalidArraySizeException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class ArrayGeneratorTest {

    @Test
    void correctArraySizeTest(){


        assertEquals(5,ArrayGenerator.generatingRandomArray(5).length);
        assertEquals(555,ArrayGenerator.generatingRandomArray(555).length);
        assertEquals(999,ArrayGenerator.generatingRandomArray(999).length);
        assertNotEquals(423,ArrayGenerator.generatingRandomArray(123).length);
    }

    }

