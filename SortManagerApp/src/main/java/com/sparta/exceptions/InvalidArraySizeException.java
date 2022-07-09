package com.sparta.exceptions;

/**
 * Custom exception class for incorrect array size
 */

public class InvalidArraySizeException extends Throwable {

    public InvalidArraySizeException(String message) {
        super(message);
    }
}
