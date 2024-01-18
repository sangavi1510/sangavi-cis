package arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Call the method to reverse the array
        int[] reversedArray = reverseArray(originalArray);

        // Display the original and reversed arrays
        System.out.println("Original Array: ");
        printArray(originalArray);

        System.out.println("\nReversed Array: ");
        printArray(reversedArray);
    }

    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        // Reverse the array
        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
