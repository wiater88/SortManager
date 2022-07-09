package com.sparta.exceptions;

/**
 * Custom exception class for not valid algorithm choice
 */

public class SortManagerInputException extends Exception{
    public SortManagerInputException(String message){
        super(message);
    }
}
