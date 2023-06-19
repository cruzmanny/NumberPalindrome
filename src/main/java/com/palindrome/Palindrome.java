package com.palindrome;
public class Palindrome {
    /**
     * Reverses the number entered.
     * @param num Number entered.
     * @return Number reversed.
     */
    public static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            reverse = ((reverse * 10) + lastDigit);
        }
        return reverse;
    }
    /**
     * Outputs whether the number is a palindrome.
     * @param userInput Numbered entered.
     */
    public static void output(int userInput) {
        int reverse = reverse(userInput);
        String str = ("Your number reversed: " + reverse);
        if (userInput != reverse) {
            System.out.printf("%s%n%s", str, "You did not enter a palindrome.");
        } else {
            System.out.printf("%s%n%s", str, "You entered a palindrome.");
        }
    }
}