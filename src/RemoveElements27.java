import java.util.Arrays;

public class RemoveElements27 {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int resIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[resIndex++] = nums[i];
            }
        }
        return resIndex++;
    }

    public static void main(String[] args) {
//        int[] arr = {0,1,2,2,3,0,4,2};
        int[] arr = {3};
        int index = removeElement(arr, 2);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }
}
