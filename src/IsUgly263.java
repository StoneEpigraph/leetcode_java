public class IsUgly263 {
    public static boolean isUgly1(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while ( (n / 2) * 2 == n) {
            n = n / 2;
        }
        while ( ( n / 3) * 3 == n) {
            n /= 3;
        }
        while ( ( n / 5) * 5 == n) {
            n /= 5;
        }
        System.out.println(n);
        return n == 1;
    }

    public static boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        if (n < 7) {
            return true;
        }
        if (n % 2 == 0){
            return isUgly(n / 2);
        }
        if (n % 3 == 0) {
            return isUgly(n / 3);
        }
        if (n % 5 == 0) {
            return isUgly(n / 5);
        }
        return false;
    }

    public static void main(String[] args) {
        int n = -2147483648;
        System.out.println(isUgly(n));
    }
}
