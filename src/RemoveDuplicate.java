import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int resIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[resIndex]) {
                continue;
            } else {
                nums[++resIndex] = nums[i];
            }
        }
        return resIndex + 1;
    }

    public static void main(String[] args) {
//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr = {1,1,2};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
}
