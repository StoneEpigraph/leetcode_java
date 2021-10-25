import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels345 {
    public static String reverseVowels(String str) {
        char[] chars = str.toCharArray();
        int front = 0, behind = chars.length - 1;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        while (front < behind) {
            while(!vowels.contains(chars[front]) && front < behind) {
                front++;
                continue;
            }
            while (!vowels.contains(chars[behind]) && front < behind) {
                behind--;
                continue;
            }
            char temp = chars[front];
            chars[front] = chars[behind];
            chars[behind] = temp;
            front++;
            behind--;
        }
        return String.valueOf(chars);
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
