package com.bridgelabz;

public class QuantityException extends Exception {
    public ExceptionType type;

    public QuantityException(ExceptionType nullException) {

    }

    public enum ExceptionType{
        INVALID_UNIT_TYPE ,NULL_EXCEPTION;
    }
    public QuantityException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}
