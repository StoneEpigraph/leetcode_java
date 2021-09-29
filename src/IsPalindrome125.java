public class IsPalindrome125 {
    public static boolean isPalindrome(String s) {
        boolean res = true;
        if (s == null || "".equals(s)) {
            return res;
        }
        int len = s.length();
        int pre = 0;
        int suf = len - 1;
        while (pre < suf) {
            char preChar = s.charAt(pre);
            char sufChar = s.charAt(suf);
            while(!isCharOrDigit(preChar)) {
                ++pre;
                if (pre >= suf) {
                    return res;
                }
                preChar = s.charAt(pre);
            }
            while(!isCharOrDigit(sufChar)) {
                --suf;
                if (pre >= suf) {
                    return res;
                }
                sufChar = s.charAt(suf);
            }
            if (preChar > 90) {
                preChar = (char) (preChar - 32);
            }
            if (sufChar > 90) {
                sufChar = (char) (sufChar - 32);
            }
            if (preChar != sufChar) {
                return false;
            } else {
                pre++;
                suf--;
            }
        }
        return res;
    }

    public static boolean isCharOrDigit(char c) {
        return (c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
