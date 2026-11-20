public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1 = String.join("", word1);
        String str2 = String.join("", word2);

        return str1.equals(str2);
    }

    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean result = arrayStringsAreEqual(word1, word2);

        System.out.println("Are the string arrays equivalent? " + result);
    }
}