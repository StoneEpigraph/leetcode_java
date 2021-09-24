import java.util.Arrays;

public class SearchInsert35 {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int end = nums.length;
        if (target < nums[0]) {
            return 0;
        } else if (target > nums[end - 1]) {
            return end;
        }
        int start = 0;
        return searchInsertIter(nums, target, start, end - 1);
    }

    public static int searchInsertIter(int[] nums, int target, int start, int end) {
        if (start + 1 == end) {
            if (nums[start] == target) {
                return start;
            } else if (nums[start] < target) {
                return end;
            }
        }
        int middle = (start + end) / 2;
        if (target == nums[middle]) {
            return middle;
        } else if(target > nums[middle]) {
            return searchInsertIter(nums, target, middle, end);
        } else {
            return searchInsertIter(nums, target, start, middle);
        }
    }


    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] nums = {1, 2, 3, 4, 5, 8, 9, 12};
//        int[] nums = {1, 3, 5, 6};
        int[] nums = {0};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
}
