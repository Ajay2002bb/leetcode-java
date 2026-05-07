import java.util.*;

public class Main {
    
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place elements in correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 &&
                   nums[i] <= n &&
                   nums[nums[i] - 1] != nums[i]) {

                int correctIndex = nums[i] - 1;

                // Swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Step 2: Find first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = firstMissingPositive(nums);

        System.out.println(result);
    }
}