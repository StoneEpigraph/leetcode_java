import java.util.Arrays;

public class AddBinary67 {

    public static String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int resLen = Math.max(aLen, bLen) + 1;
        char[] resChar = new char[resLen];
        int additional = 0;
        while (aLen >= 0 || bLen >= 0) {
            int aChar = 0;
            int bChar = 0;
            if (aLen-- > 0) {
                 aChar = a.charAt(aLen);
            } else {
                aChar = '0';
            }
            if (bLen-- > 0) {
                bChar = b.charAt(bLen);
            } else {
                bChar = '0';
            }
            int temp = (aChar + bChar) % 96 + additional;
            switch (temp) {
                case 1:
                    resChar[--resLen] = '1';
                    additional = 0;
                    break;
                case 2:
                    resChar[--resLen] = '0';
                    additional = 1;
                    break;
                case 3:
                    resChar[--resLen] = '1';
                    additional = 1;
                    break;
                default:
                    resChar[--resLen] = '0';
                    additional = 0;
            }
        }
        String res = new String(resChar);
        if (resChar[0] == '1') {
            return res;
        } else {
            return res.substring(1, res.length());
        }
    }

    public static void main(String[] args) {
        String a = "1111";
        String b = "1111";
        System.out.println(addBinary(a, b));
    }
}
