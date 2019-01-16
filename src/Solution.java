import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * I was so stupid
     * @param nums
     * @param target
     * @return
     */
    public static int[] selfTwoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int guessFirst = nums[i];
            res[0] = i;
            int guessSecond = target - guessFirst;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == guessSecond) {
                    res[1] = j;
                    if (res[0] != res[1]) {
                        return res;
                    }
                }
            }
        }
        return res;
    }

    /**
     * Other people's children
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;
        int[] res = Solution.twoSum(nums, target);
        System.out.println("first: " + res[0] + "second: " + res[1]);
        int[] intArr = {1,2,3};
        System.out.println(Arrays.asList(intArr).contains(new Integer(2)));
    }
}