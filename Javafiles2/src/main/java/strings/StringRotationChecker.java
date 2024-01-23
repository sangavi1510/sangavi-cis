package strings;

import java.util.Scanner;

public class StringRotationChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();


        boolean isRotation = isRotation(str1, str2);


        if (isRotation) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }


    private static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }


        String concatenatedStr = str1 + str1;


        return concatenatedStr.contains(str2);
    }
}
