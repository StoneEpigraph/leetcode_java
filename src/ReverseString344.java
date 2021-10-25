import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString344 {
    public static void reverseString(char[] chars) {
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (i > len / 2 - 1) {
                return;
            }
            char temp = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len -i - 1] = temp;
        }
    }

    public static void main(String[] args) {
//        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] chars = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        System.out.println(chars);
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            charList.add(chars[i]);
        }
        Collections.reverse(charList);
        System.out.println(charList);
        reverseString(chars);
        System.out.print('[');
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            System.out.print(", ");
        }
        System.out.print(']');
    }
}
