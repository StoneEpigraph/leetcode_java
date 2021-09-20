import java.util.*;

/**
 * @author stone
 */
public class IsValidParentheses20 {

    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid2(str));
    }

    public static boolean isValid1(String str) {
        List<String> preList = Arrays.asList("(", "[", "{");
        List<String> sufList = Arrays.asList(")", "]", "}");
        if (str == null || "".equals(str)) {
            return true;
        }
        List<String> temp = new ArrayList<>();
        String preStr = String.valueOf(str.charAt(0));
        temp.add(preStr);
        for (int i = 1; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (preList.contains(s)) {
                preStr = s;
                temp.add(s);
            } else if (sufList.contains(s)) {
                if (temp.size() == 0 || preList.indexOf(preStr) != sufList.indexOf(s)) {
                    return false;
                } else {
                    temp.remove(temp.size() - 1);
                    if (temp.size() > 0) {
                        preStr = temp.get(temp.size() - 1);
                    }
                }
            }
        }
        return temp.size() == 0;
    }


    public static boolean isValid2(String str) {
        List<Character> preList = Arrays.asList('(', '[', '{');
        List<Character> sufList = Arrays.asList(')', ']', '}');
        if (str == null || "".equals(str)) {
            return true;
        }
        Stack<Character> temp = new Stack<>();
        char preStr = str.charAt(0);
        temp.add(preStr);
        for (int i = 1; i < str.length(); i++) {
            char s = str.charAt(i);
            if (preList.contains(s)) {
                preStr = s;
                temp.push(s);
            } else if (sufList.contains(s)) {
                if (temp.size() == 0 || preList.indexOf(preStr) != sufList.indexOf(s)) {
                    return false;
                } else {
                    temp.pop();
                    if (temp.size() > 0) {
                        preStr = temp.get(temp.size() - 1);
                    }
                }
            }
        }
        return temp.size() == 0;
    }



    public static boolean isValid(String str) {
        List<Character> preList = Arrays.asList('(', '[', '{');
        List<Character> sufList = Arrays.asList(')', ']', '}');
        Map<Character, Character> map = new HashMap<Character, Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        if (str == null || "".equals(str)) {
            return true;
        }
        Stack<Character> temp = new Stack<>();
        char preStr = str.charAt(0);
        temp.add(preStr);
        for (int i = 1; i < str.length(); i++) {
            char s = str.charAt(i);
            if (map.containsKey(s)) {
                if (temp.size() == 0 || temp.peek() != map.get(s)) {
                    return false;
                } else {
                    temp.pop();
                }
            } else {
                temp.push(s);
            }
        }
        return temp.size() == 0;
    }
}
