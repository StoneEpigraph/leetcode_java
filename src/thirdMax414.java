public class thirdMax414 {
    public static int thirdMax(int[] nums) {
        int len = nums.length;
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            long temp = nums[i];
            if (temp > third) {
                if (temp == second) {
                    continue;
                }
                if (temp > second) {
                    if (temp == first) {
                        continue;
                    }
                    if (temp > first) {
                        third = second;
                        second = first;
                        first = temp;
                    } else {
                        third = second;
                        second = temp;
                    }
                } else {
                    third = temp;
                }
            }
        }
        return Long.MIN_VALUE == third ? (int) first : (int) third;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,5,3,5};
        System.out.println(thirdMax(arr));
    }
}
