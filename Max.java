
public class Max{
    public static void main(String[] args) {
        int[] damage = {2, 7, 4, 3};
        int armor = 4;

        long total = 0;
        int max = 0;

        for (int i = 0; i < damage.length; i++) {
            total += damage[i];
            max = Math.max(max, damage[i]);
        }

        long ans = total - Math.min(max, armor) + 1;

        System.out.println(ans);
    }
}
