class MySqrt69 {
    public static int mySqrt(int x) {
        int guess = x / 2;
        if (x == 0) {
            return 0;
        }else if (x < 4) {
            return 1;
        }
        return sqrtIter(x, guess, guess);
    }

    public static int sqrtIter(int x, int guessTmp, int maxGuess) {
        long guess = (long) guessTmp;
        if (guess * guess == x || (guess * guess < x && (guess + 1) * (guess + 1) > x)) {
            return (int) guess;
        } else if (((long)guess) * guess < x) {
            return sqrtIter(x, (int)(guess + maxGuess) / 2, maxGuess);
        } else {
            return sqrtIter(x, (int)(guess + 1) / 2, (int) guess);
        }
    }

    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        x = 1;
        System.out.println(x);
        System.out.println(mySqrt(x));
    }
}