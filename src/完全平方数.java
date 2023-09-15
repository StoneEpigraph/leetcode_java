public class 完全平方数 {
    public static void main(String[] args) {
        System.out.println(202050 * 202050L);
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int left = 0;
        int right = (int) (num / 2);
        long square = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;

    }

}
