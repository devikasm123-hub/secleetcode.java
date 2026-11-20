public class EvenDigits {

    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digits = 0;

            while (num > 0) {
                digits++;
                num = num / 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int result = findNumbers(nums);

        System.out.println("Count: " + result);
    }
}