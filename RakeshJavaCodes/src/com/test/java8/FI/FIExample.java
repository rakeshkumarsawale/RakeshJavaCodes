package com.test.java8.FI;

public class FIExample {
    public static void main(String[] args) {
        // Lambda expression to implement the 'operate' method for addition
        Calculator addition = (a, b) -> a + b;
        System.out.println("Result: " + addition.operate(5, 3)); // Output: Result: 8
    }
}

