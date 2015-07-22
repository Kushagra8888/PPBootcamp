/**
 * Created by test on 7/20/2015.
 */
public class powerOfTwo {

    public static boolean isPowerOfTwo(int num) {
        while (num > 1) {
            if (num % 2 == 1){
                return false;
            }
            num /= 2;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfTwo(1));

    }
}
