public class TitleToNumber171 {
    public static int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int res = 0;
        for (int i = len - 1; i >= 0; i--) {
            char temp = columnTitle.charAt(i);
            res += Math.pow(26, len - i - 1) * (temp - 64);
        }
        return res;
    }

    public static void main(String[] args) {
        String temp = "FXSHRXW";
        System.out.println(titleToNumber(temp));
    }
}
