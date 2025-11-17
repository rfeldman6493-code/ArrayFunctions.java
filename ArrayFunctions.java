import java.util.Arrays;

public class ArrayFunctions {

    // Method #1: newArray
    public static String[] newArray(int size, String word) {
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = word;
        }
        return arr;
    }

    // Method #2: printEvens (fixed version)
    public static void printEvens(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]);
            }
        }
    }

    // Method #3: resizeArray
    public static int[] resizeArray(int[] nums) {
        int[] newArr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        // Testing
        String[] testArr = newArray(4, "Hello!");
        System.out.println(Arrays.toString(testArr));

        int[] nums = {1, 2, 3, 2, 2, 8, 8, 6, 7};
        printEvens(nums); // should print 222886

        int[] resized = resizeArray(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(resized));
    }
}

