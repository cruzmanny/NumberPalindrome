package com.palindrome;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PalindromeTest {
    @Test
    @DisplayName("Palindrome Test")
    void output() {
        assertAll(() -> assertEquals(4321, Palindrome.reverse(1234)),
                () -> assertEquals(121, Palindrome.reverse(121)),
                () -> assertEquals(48932, Palindrome.reverse(23984)));
    }
}