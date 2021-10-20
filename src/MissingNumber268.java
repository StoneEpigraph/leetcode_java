public class MissingNumber268 {
    public static int missingNumber(int[] nums) {
        byte[] bArr = new byte[nums.length + 1];
        for (int num : nums) {
            bArr[num] = 1;
        }
        for (int i = 0; i <= bArr.length; i++) {
            if (bArr[i] != 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
}
