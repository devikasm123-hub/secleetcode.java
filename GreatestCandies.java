import java.util.*;

public class GreatestCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int max = 0;

        // Find the maximum number of candies
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Check each child
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println("Result: " + result);
    }
}
