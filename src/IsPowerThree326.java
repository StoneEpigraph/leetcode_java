public class IsPowerThree326 {
    public boolean isPowerThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 1) {
            return false;
        }
        while(n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(3, 0));
    }
}
