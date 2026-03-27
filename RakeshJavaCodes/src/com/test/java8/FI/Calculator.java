package com.test.java8.FI;

@FunctionalInterface
public interface Calculator {
    // The single abstract method
    int operate(int a, int b);

    // Can also have default methods (optional)
    default void printOperation(String opName) {
        System.out.println("Performing operation: " + opName);
    }
}