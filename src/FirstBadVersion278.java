public class FirstBadVersion278 {

    static boolean isBadVersion(int version) {
        return version >= 1702766719;
    }

    public static int firstBadVersion1(int n) {
        if (n == 1) {
            return n;
        }
        return firstBadVersionIter(0, n);
    }

    public static int firstBadVersionIter(int left, int right) {
        if (left >= right) {
            return left;
        } else {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                return firstBadVersionIter(left, mid);
            } else {
                return firstBadVersionIter(mid + 1, right);
            }
        }
    }

    public static int firstBadVersion(int version) {
        int left = 1, right = version;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {


        System.out.println(firstBadVersion(2126753390));
    }
}
