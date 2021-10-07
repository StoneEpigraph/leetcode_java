import java.util.HashMap;
import java.util.Map;

public class ContainsNearByDuplicate219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                Integer integer = map.get(num);
                if (i - integer <= k) {
                    return true;
                }
            }
            map.put(num, i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(arr, 2));
    }
}
