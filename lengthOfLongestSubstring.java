import java.util.*;

public class Main {

    public static int lengthOfLongestSubstring(String s) {

        int[] map = new int[128];

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map[ch]++;

            while (map[ch] > 1) {
                map[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));

        sc.close();
    }
}