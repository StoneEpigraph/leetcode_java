import java.util.Arrays;

public class PlusOne66 {
    public static int[] plusOne(int[] digits) {
        return plusOneIter(digits, digits.length - 1);
    }

    public static int[] plusOneIter(int[] digits, int num) {
        if (num >= 0) {
            if (digits[num] == 9) {
                digits[num] = 0;
                return plusOneIter(digits, num - 1);
            } else {
                digits[num] += 1;
                return digits;
            }
        } else {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length - 1);
            return res;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,8};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}