public class LenthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int wordLength = 0;
        for (int i = index; i > 0; i--) {
            if (' '  == s.charAt(i)) {
                index--;
            } else {
                break;
            }
        }
        while(index > -1 && ' ' != s.charAt(index)) {
            wordLength++;
            index--;
        }
        return wordLength;
    }
}