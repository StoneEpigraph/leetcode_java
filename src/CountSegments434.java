public class CountSegments434 {
    /**
     * 设置临时字符为空，遍历字符串，如果当前字符不为空并且上一个字符为空，总数加一，每一次遍历都反当前字符赋值给临时字符。
     * @param s
     * @return
     */
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
