package programs;

public class PalindromeChecker {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        // Test cases
        int palindromeNum1 = 121;
        System.out.println(palindromeNum1 + " is a palindrome: " + isPalindrome(palindromeNum1));

        int nonPalindromeNum = 123;
        System.out.println(nonPalindromeNum + " is a palindrome: " + isPalindrome(nonPalindromeNum));

        int palindromeNum2 = 1221;
        System.out.println(palindromeNum2 + " is a palindrome: " + isPalindrome(palindromeNum2));
    }
}
