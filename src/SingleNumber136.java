import java.util.*;

public class SingleNumber136 {
    public static int singleNumber1(int[] nums) {
        int res = -1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer tmp = nums[i];
            if (set.contains(tmp)) {
                set.remove(tmp);
            } else {
                set.add(tmp);
            }
        }
        return new ArrayList<>(set).get(0);
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(singleNumber(arr));
    }
}
