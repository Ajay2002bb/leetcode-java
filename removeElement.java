import java.util.*;

public class Main {

    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index; // new length
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // array input
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // value to remove
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println(k);

        // updated array print
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}