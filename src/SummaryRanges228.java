import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static List<String> summaryRanges1(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums != null && nums.length > 0) {
            String preStr = String.valueOf(nums[0]);
            int preInt = nums[0];
            int preX = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (++preX != nums[i]) {
                    if (preInt == (preX - 1)) {
                        res.add(preStr);
                    } else {
                        res.add(preStr + "->" + (preX - 1));
                    }
                    preStr = String.valueOf(nums[i]);
                    preInt = nums[i];
                    preX = nums[i];
                }
            }
            if (String.valueOf(preX).equals(preStr)) {
                res.add(preStr);
            } else {
                res.add(preStr + "->" + preX);
            }
        }
        return res;
    }

    public static List<String> summaryRanges(int[] arr) {
        List<String> res = new ArrayList<>();
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int low = 0;
            i++;
            while(i < n && arr[i] == arr[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuffer sb = new StringBuffer(Integer.toString(arr[low]));
            if (low < high) {
                sb.append("->");
                sb.append(Integer.toString(arr[high]));
            }
            res.add(sb.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(arr));
    }
}
