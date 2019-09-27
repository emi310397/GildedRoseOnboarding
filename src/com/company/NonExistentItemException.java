package com.company;

public class NonExistentItemException extends Exception {
    public NonExistentItemException(String message){
        super(message);
    }
}
