import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Intersection349
 * @Description TODO
 * @Author StoneEpigraph
 * @Date 2021/10/28 下午10:38
 * @Version 1.0
 **/
public class Intersection349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Set<Integer> set1 = new HashSet(len1);
        Set<Integer> set2 = new HashSet(len2);
        Set<Integer> resSet = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set2.add(i) && !set1.add(i)) {
                resSet.add(i);
            }
        }
        int[] res = new int[resSet.size()];
        return resSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4, 5, 5};
        int[] res = intersection(nums1, nums2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
