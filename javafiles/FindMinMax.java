package arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 1, 7, 5};

        findMinMax(numbers);
    }

    public static void findMinMax(int[] array) {

        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = array[0];
        int max = array[0];


        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }


        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
