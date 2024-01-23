package strings;

import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        scanner.close();


        String reversedSentence = reverseWords(inputSentence);


        System.out.println("Reversed Sentence: " + reversedSentence);
    }


    private static String reverseWords(String sentence) {

        String[] words = sentence.split("\\s");


        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }


        return String.join(" ", words);
    }


    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;


        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}
