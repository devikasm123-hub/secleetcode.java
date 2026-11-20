public class Number{

    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 11;

        int result = hammingWeight(n);

        System.out.println("Number of 1 bits: " + result);
    }
}