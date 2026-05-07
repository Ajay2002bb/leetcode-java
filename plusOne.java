import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] digits = {1, 2, 3}; // example input
        int[] result = sol.plusOne(digits);

        System.out.println(Arrays.toString(result));
    }
}