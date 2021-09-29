public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {-1, -1};
        int pre = 0;
        int suf = numbers.length - 1;
        while(pre < suf) {
            int preInt = numbers[pre];
            int sufInt = numbers[suf];
            if (preInt + sufInt == target) {
                res = new int[]{pre + 1, suf + 1};
                break;
            } else if(preInt + sufInt > target) {
                suf--;
            } else {
                pre++;
            }
        }
        return res;
    }
}
