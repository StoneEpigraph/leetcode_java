public class CountBits338 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i < n; i++) {
            res[i] = countBit(i);
        }
        return res;
    }

    public static int countBit(int num) {
        int res = 0;
        while (num > 0) {
            num = num & (num - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int i = 3;
        System.out.println(countBit(i));
    }
}
