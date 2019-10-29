package com.solace.spring.cloud.core;

public class NoSolaceServiceFoundException extends Exception {
    protected NoSolaceServiceFoundException(String message) {
        super(message);
    }
}
