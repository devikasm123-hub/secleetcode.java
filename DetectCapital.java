public class DetectCapital {

    public static boolean detectCapitalUse(String word) {

        int capitalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        // All letters are capital
        if (capitalCount == word.length()) {
            return true;
        }

        // No letters are capital
        if (capitalCount == 0) {
            return true;
        }

        // Only first letter is capital
        return capitalCount == 1 && Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {

        String word = "USA";

        boolean result = detectCapitalUse(word);

        System.out.println("Correct Capital Usage: " + result);
    }
}