public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {3, 0, 8, 0, 4, 2, 0, 6, 0, 9};

        moveZerosToEnd(array);

        // Display the modified array
        System.out.println("Array after moving zeros to the end:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Iterate through the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the first zero or non-zero position
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                // Move the nonZeroIndex to the next position
                nonZeroIndex++;
            }
        }
    }
}
