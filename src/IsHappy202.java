import java.util.HashSet;
import java.util.Set;

public class IsHappy202 {
    public static int getNext(int n) {
        int res = 0;
        while(n >= 10) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res += n * n;
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
    }
}
