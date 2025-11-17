import java.util.Arrays;

public class ArrayFunctions {

    // Method #1: newArray
    // Takes an int (size) and a String (word), fills an array with that string, returns it
    public static String[] newArray(int size, String word) {
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = word;
        }
        return arr;
    }

    // Method #2: printEvens
    // Takes an int array and prints only even numbers (no spaces, one line)
    public static void printEvens(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]);
            }
        }
        System.out.println(); // move to new line after printing
    }

    // Method #3: resizeArray
    // Takes an int array, returns a new array double the size
    // The first half is the same as the original, the rest are zeros
    public static int[] resizeArray(int[] nums) {
        int[] newArr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        // Test newArray
        String[] testArr = newArray(4, "Hello!");
        System.out.println(Arrays.toString(testArr)); // should print [Hello!, Hello!, Hello!, Hello!]

        // Test printEvens
        int[] nums = {1, 2, 3, 2, 2, 8, 8, 6, 7};
        printEvens(nums); // should print 222886

        // Test resizeArray
        int[] resized = resizeArray(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(resized)); // should print [1, 2, 3, 0, 0, 0]
    }
}
