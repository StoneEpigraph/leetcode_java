import java.util.Arrays;

public class MinMoves453 {
    public static int minMoves(int[] nums) {
        int res = 0;
        int min = Arrays.stream(nums).min().getAsInt();
        for (int num : nums) {
            res += num - min;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5, 6};
        System.out.println(minMoves(arr));
    }
}
