public class IsPowerTwo231 {
    public static boolean isPowerTwo1(int n) {
        if (n < 1) {
            return false;
        }
        int res = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                res++;
            }
            n >>= 1;
            if (res > 1) {
                return false;
            }
        }
        if (res == 1) {
            return true;
        }
        return false;
    }

    public static boolean isPowerTwo(int n) {
        return n > 0 && ( (n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerTwo(3));
    }
}
