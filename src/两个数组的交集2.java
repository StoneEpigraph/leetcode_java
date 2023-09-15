import sun.security.util.BitArray;

import java.util.*;

public class 两个数组的交集2 {

    public static void main(String[] args) {
        int[]  nums1 = {1, 2, 1, 2};
        int[] nums2 = {1, 2, 3, 4, 2};
        System.out.println(get(nums1, nums2).toString());
    }

    public static int[] get(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return get(nums2, nums1);
        }
        Map<Integer, Integer> map  = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for (int num: nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                res[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
