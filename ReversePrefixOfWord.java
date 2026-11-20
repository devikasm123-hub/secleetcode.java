public class ReversePrefixOfWord {

    public static String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        String prefix = word.substring(0, index + 1);
        String suffix = word.substring(index + 1);

        String reversedPrefix = new StringBuilder(prefix)
                .reverse()
                .toString();

        return reversedPrefix + suffix;
    }

    public static void main(String[] args) {

        String word = "abcdefd";
        char ch = 'd';

        String result = reversePrefix(word, ch);

        System.out.println("Result: " + result);
    }
}