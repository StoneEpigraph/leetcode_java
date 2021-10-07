public class CountSegments434 {
    public static int countSegments(String s) {
        if (s == null) {
            return 0;
        }
        int res = 0;
        int len = s.length();
        int pre = 32;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 32) {
                if (pre == 32) {
                    continue;
                }
            } else {
                if (pre == 32) {
                    res++;
                }
            }
            pre = c;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "  ";
        System.out.println(countSegments(str));
    }
}
