public class HammingWeight191 {
    public static int hammingWeight1(int n) {
        int count = 0;
        for(int i = 0; i < 32 && n != 0; i++) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            ++count;
            n &= (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
    }
}
