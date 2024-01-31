package programs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome() {
        int i = 121;
        assertTrue(PalindromeChecker.isPalindrome(i));

    }

    @Test
    void isNotPalindrome() {
        int i = 123;
        assertFalse(PalindromeChecker.isPalindrome(i));

    }
}