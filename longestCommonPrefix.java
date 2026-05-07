import java.util.*;

public class Main {

    public static String longestCommonPrefix(String[] strs) {
	if (strs == null || strs.length == 0)
            return "";
        String first = strs[0];
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, count);
                }
            }
            count++;
        }

        return first.substring(0, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        System.out.println(longestCommonPrefix(strs));
    }
}