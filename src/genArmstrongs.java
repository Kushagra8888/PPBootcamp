import java.util.ArrayList;

/**
 * Created by test on 7/20/2015.
 */
public class genArmstrongs {

    public static int Sum(ArrayList numbers) {
        return 0;
    }

    public static ArrayList Digits(int p) {
        ArrayList digits = new ArrayList();
        return digits;
    }

    public static boolean isArmstrong(int p) {
        return p == Sum(Digits(p));
    }

    public static void main(String args[]) {
        int START = 100;
        int LIMIT = 1000;

        for (int n =  START; n < LIMIT; n++) {
            if (isArmstrong(n)){
                System.out.println(n);
            }
        }
    }
}
