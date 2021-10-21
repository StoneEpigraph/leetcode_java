import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern290 {
    public static boolean wordPattern1(String pattern, String s) {
        if (pattern == null && s == null) {
            return true;
        }
        if (pattern == null || s == null) {
            return false;
        }
        String[] strArr = s.split("\\s+");
        if (strArr.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < strArr.length; i++) {
            char c = pattern.charAt(i);
            String str = strArr[i];
            if (map.containsKey(c)) {
                if (!str.equals(map.get(c))) {
                    return false;
                }
            } else {
                map.put(c, str);
                if (set.contains(str)) {
                    return false;
                } else {
                    set.add(str);
                }
            }
        }
        return true;
    }

    public static boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();
        int len = str.length();
        int i = 0;
        for (int p = 0; p < pattern.length(); ++p) {
            char c = pattern.charAt(p);
            if (i >= len ) {
                return false;
            }
            int j = i;
            while(j < len && str.charAt(j) != ' ') {
                j++;
            }
            String tmp = str.substring(i, j);
            if (map.containsKey(c) && !tmp.equals(map.get(c))) {
                return false;
            }
            if (reverseMap.containsKey(tmp) && c != reverseMap.get(tmp)) {
                return false;
            }
            map.put(c, tmp);
            reverseMap.put(tmp, c);
            i = j + 1;
        }
        return i >= len;
    }

    public static void main(String[] args) {

        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }
}
