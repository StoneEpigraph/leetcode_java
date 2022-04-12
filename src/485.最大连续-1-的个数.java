/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int tempCount = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (num == 1) {
                tempCount++;
            } else {
                if (maxCount < tempCount) {
                    maxCount = tempCount;
                }
                tempCount = 0;
            }
        }
        if (tempCount >= maxCount) {
            maxCount = tempCount;
        }
        return maxCount;
    }
}
// @lc code=end

