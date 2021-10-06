import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic205 {
    public static boolean isIsomorphic1(String s, String t) {
        if (s == null || "".equals(s)) {
            return true;
        }
        boolean res = true;
        int len = s.length();
        Map<Character, Character> charMap = new HashMap<>();
        Map<Character, Character> valueCharMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if(charMap.containsKey(key) || valueCharMap.containsKey(value)) {
                Character tempValue = charMap.get(key);
                if (tempValue == null) {
                    res = false;
                    break;
                }
                if (tempValue != value) {
                    res = false;
                    break;
                }
                Character tempKey = valueCharMap.get(value);
                if (tempKey == null) {
                    res = false;
                    break;
                }
                if (tempKey != key) {
                    res = false;
                    break;
                }
            } else {
                charMap.put(key, value);
                valueCharMap.put(value, key);
            }

        }
        return res;
    }


    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
