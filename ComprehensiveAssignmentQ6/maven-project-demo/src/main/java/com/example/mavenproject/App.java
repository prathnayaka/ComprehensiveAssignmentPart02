package com.example.mavenproject;

public class App {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Change this to your desired number
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}
