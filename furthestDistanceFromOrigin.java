import java.util.*;

public class Main {

    public static int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int unknown = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                left++;
            } else if (ch == 'R') {
                right++;
            } else {
                unknown++;
            }
        }

        return Math.abs(left - right) + unknown;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String moves = sc.nextLine();

        int result = furthestDistanceFromOrigin(moves);

        System.out.println(result);

        sc.close();
    }
}