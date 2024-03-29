import java.util.HashMap;
import java.util.Map;

public class IsAnagram242 {
    public static boolean isAnagram1(String s, String t) {
        int len = s.length();
        if (len != t.length()) {
            return false;
        }
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            firstMap.put((char) ('a' + i), 0);
            secondMap.put((char) ('a' + i), 0);
        }
        for (int i = 0; i < len; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            firstMap.put(c1, firstMap.get(c1) + 1);
            secondMap.put(c2, secondMap.get(c2) + 1);
        }
        for (Map.Entry<Character, Integer> entry : firstMap.entrySet()) {
            Character key = entry.getKey();
            if (entry.getValue().intValue() != secondMap.get(key).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "nagram";
        String s2 = "angmar";
        System.out.println(isAnagram(s1, s2));
    }
}
