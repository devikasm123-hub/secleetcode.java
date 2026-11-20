
import java.util.*;

public class differencearray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int n : set1) {
            if (!set2.contains(n))
                list1.add(n);
        }

        for (int n : set2) {
            if (!set1.contains(n))
                list2.add(n);
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}

