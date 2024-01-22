import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();


        int vowelCount = countVowels(inputString);


        System.out.println("Number of vowels in the string: " + vowelCount);
    }


    private static int countVowels(String str) {
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}