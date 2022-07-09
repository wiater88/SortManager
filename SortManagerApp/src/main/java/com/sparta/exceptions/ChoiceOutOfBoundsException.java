package com.sparta.exceptions;

/**
 * Custom exception class for not valid input in InputManager class
 */

public class ChoiceOutOfBoundsException extends Exception{
    public ChoiceOutOfBoundsException(String message){
        super(message);
    }
}
