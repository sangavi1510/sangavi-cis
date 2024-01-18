package arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int positionsToRotate = 2;


        int[] rotatedArray = rotateLeft(originalArray, positionsToRotate);


        System.out.println("Original Array: ");
        printArray(originalArray);

        System.out.println("\nRotated Array: ");
        printArray(rotatedArray);
    }

    public static int[] rotateLeft(int[] array, int positions) {
        int length = array.length;
        int[] rotatedArray = new int[length];


        for (int i = 0; i < length; i++) {
            int newPosition = (i + positions) % length;
            rotatedArray[i] = array[newPosition];
        }

        return rotatedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
