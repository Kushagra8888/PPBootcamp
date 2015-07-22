/**
 * Created by test on 7/20/2015.
 */
public class PerfectSquare {

    public static boolean allDigitsEven(int n) {
        while (n > 0) {
            if (n % 10 == 1){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean isPerfectSquare(int n) {
        int p = 0;
        while (p * p < n) {
            p++;
        }
        return p * p == n;
    }

    public static void main(String args[]) {
        int FIRST = 2000;
        int LAST = 10000;
        for (int num = FIRST; num < LAST; num += 2) {
            if (isPerfectSquare(num) && allDigitsEven(num)) {
                System.out.println(num);
            }
        }
    }
}
