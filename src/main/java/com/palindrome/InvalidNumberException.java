package com.palindrome;
public class InvalidNumberException extends Exception {
    private static void validate(int num) throws InvalidNumberException {
        if (num < 0) {
            throw new InvalidNumberException();
        }
    }
    public static void throwing(int num){
        try {
            validate(num);
        } catch (InvalidNumberException ex) {
            System.out.println("Exception occurred: " + ex);
            System.exit(0);
        }
    }
}