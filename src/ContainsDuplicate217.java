import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
