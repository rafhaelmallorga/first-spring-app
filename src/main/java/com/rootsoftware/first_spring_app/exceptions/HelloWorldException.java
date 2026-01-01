package com.rootsoftware.first_spring_app.exceptions;

public class HelloWorldException extends RuntimeException {
    public HelloWorldException() { super("Hello World Error!"); }

    public HelloWorldException(String message) { super(message); }
}
