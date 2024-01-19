package arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12, 0, 7};


        moveZeros(numbers);


        System.out.println("Modified Array: ");
        printArray(numbers);
    }

    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;


        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
