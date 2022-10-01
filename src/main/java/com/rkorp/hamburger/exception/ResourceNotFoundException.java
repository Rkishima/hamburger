package com.rkorp.hamburger.exception;

import java.io.Serial;

public class ResourceNotFoundException extends Exception{

    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
