/**
 * Created by test on 7/20/2015.
 */
public class CollatzSequence {
    public static void main(String args[]) {
        int collatzTerm = 4;
        while(collatzTerm != 4) {
            System.out.println(collatzTerm);
            if (collatzTerm % 2 == 0) {
                collatzTerm /= 2;
            }
            else {
                collatzTerm = collatzTerm * 3 + 1;
            }
        }
        System.out.println(4);
        System.out.println(2);
        System.out.println(1);
    }
}
