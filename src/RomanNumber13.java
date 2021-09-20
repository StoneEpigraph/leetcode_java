/**
 * @author stone
 */
public class RomanNumber13 {

    public static void main(String[] args) {
        String romainStr = "XIII";
        System.out.println(romainToInt(romainStr));
    }

    public static int romainToInt(String romainStr) {
        if (romainStr == null || "".equals(romainStr.trim())) {
            return 0;
        }
        int sum = 0;
        int preRomainNum = getValue(romainStr.charAt(0));
        for (int i = 1; i < romainStr.length(); i++) {
            int num = getValue(romainStr.charAt(i));
            if (num > preRomainNum) {
                sum -= preRomainNum;
            } else {
                sum += preRomainNum;
            }
            preRomainNum = num;
        }
        sum += preRomainNum;
        return sum;
    }

    /**
     * 将单个罗马字符转成数字
     * @param romanChar
     * @return
     */
    public static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
