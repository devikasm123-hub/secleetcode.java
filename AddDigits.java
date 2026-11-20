import java.util.*;

public class AddDigits {

    public static int strobogrammaticInRange(String low, String high) {
        int count = 0;

        for (long i = Long.parseLong(low);
             i <= Long.parseLong(high);
             i++) {

            if (isStrobogrammatic(String.valueOf(i))) {
                count++;
            }
        }

        return count;
    }

    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();

        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {

            char a = num.charAt(left);
            char b = num.charAt(right);

            if (!map.containsKey(a) || map.get(a) != b) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String low = "50";
        String high = "100";

        int result = strobogrammaticInRange(low, high);

        System.out.println("Count: " + result);
    }
}
