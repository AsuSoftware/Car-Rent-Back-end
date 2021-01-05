package com.asusoftware.carrent.exception;

/**
 * car-rent Created by Antonio on 12/31/2020
 */
public class UserNotFoundException extends RentException{
    public UserNotFoundException() {
        super("User not found");
    }
}
