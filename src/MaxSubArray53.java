public class MaxSubArray53 {
    /**
     * 1. 将数组第一个赋值给max;
     * 2. 将pre + nums[preIndex]与pre比较， 保留大的给pre
     * 3. 将maxS与pre比较留最大的
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxS = nums[0];
        for (int i : nums) {
            pre = Math.max(pre + i, i);
            maxS = Math.max(pre, maxS);
        }
        return maxS;
    }
}
