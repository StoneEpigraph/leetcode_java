public class IsPowerFour342 {
    public static boolean isPowerFour(int n) {
        while( n > 1 && n % 4 == 0) {
            n /=4;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerFour(16));
    }
}
