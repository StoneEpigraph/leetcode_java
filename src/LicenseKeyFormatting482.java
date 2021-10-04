
public class LicenseKeyFormatting482 {
    public static String licenseKeyFormatting(String s, int k) {
        int len = s.length() - 1;
        int temp = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = len; i >= 0; i--) {
            char c = s.charAt(i);
            if (c > 96) {
                c = (char) (c - 32);
            }
            if (c == '-') {
                continue;
            }
            if (temp < k) {
                sb.append(c);
                temp++;
            } else {
                sb.append('-');
                sb.append(c);
                temp = 1;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "5F3Z-2e-9-w";
        System.out.println(licenseKeyFormatting(str, 4));
    }
}
