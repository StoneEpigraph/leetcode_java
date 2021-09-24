public class StrStr28 {
    public static int strStr(String haystack, String needle) {
        int res = -1;
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        int srcLen = haystack.length();
        int innerLen = needle.length();
        if (srcLen < innerLen) {
            return res;
        }
        for (int i = 0; i <= srcLen - innerLen; i++) {
            if(haystack.substring(i, innerLen + i).equals(needle)) {
                return i;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "lo";
        System.out.println(strStr(haystack, needle));
    }
}
