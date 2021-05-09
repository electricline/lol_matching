package com.harden.lol_matching.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String entity) {
        super(entity + " not found");
    }

}
