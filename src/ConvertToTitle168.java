public class ConvertToTitle168 {
    public static String convertToTitle1(int columnNumber) {
        columnNumber--;
        if (columnNumber < 26) {
            return (char)(columnNumber % 26 + 'A') + "";
        }
        return convertToTitle(columnNumber / 26) + (char) (columnNumber % 26 + 'A');
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;//解决从1开始的关键
            sb.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(convertToTitle(num));
        System.out.println(25 + 'A');
    }
}
