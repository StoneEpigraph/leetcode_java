public class Move2Zeros283 {
    public static void moveZeroes1(int[] nums) {
        if (nums != null && nums.length > 1) {
            int slow = 0;
            for (int fast = 1; fast < nums.length;) {
                if (nums[slow] == 0) {
                    while(fast < nums.length - 1 && nums[fast] == 0) {
                        fast++;
                    }
                    nums[slow++] = nums[fast];
                    nums[fast++] = 0;
                } else {
                    slow++;
                    fast++;
                }
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while(right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,0};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
