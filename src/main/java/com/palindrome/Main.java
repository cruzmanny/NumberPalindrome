package com.palindrome;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        InvalidNumberException.throwing(num);
        Palindrome.output(num);
    }
}