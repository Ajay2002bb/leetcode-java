import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int[] result = {map.get(complement), i};
                System.out.println(Arrays.toString(result));
                return; // stop after finding answer
            }
            map.put(nums[i], i);
        }
        System.out.println("No solution found");
    }
}