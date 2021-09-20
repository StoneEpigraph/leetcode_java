public class MaxLengPreStr14 {

    public static void main(String[] args) {
//        String[] strs = new String[]{"abc", "a", "abcde"};
        String[] strs = new String[]{"abc"};
        System.out.println(longestCommonPrefix(strs));
    }

        public static String longestCommonPrefix(String[] strs) {
            String res = "";
            if (strs == null || strs.length < 1) {
                return res;
            }
            if (strs.length == 1) {
                return strs[0];
            }
            String preStr = strs[0];
            for (int i = 1; i < strs.length; i++) {
                if (preStr == null || preStr.length() < 1) {
                    return res;
                }
                String currStr = strs[i];
                int preLen = preStr.length();
                int currLen = currStr.length();
                int len = Math.min(preLen, currLen);
                for ( int j = 0; j < len; j++) {
                    if (preStr.charAt(j) != currStr.charAt(j)) {
                        len = j;
                        break;
                    }
                }
                preStr = preStr.substring(0, len);
                res = preStr;
            }
            return res;
        }
};