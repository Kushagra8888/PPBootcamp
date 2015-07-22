/**
 * Created by test on 7/20/2015.
 */
public class oneTwoHundred {
    public static void main(String args[]) {
        for (int term = 1; term < 100; term ++){
            if (term % 3 == 0){
                if (term % 5 == 0) {
                    System.out.println("FIZZ BUZZ");
                }
                else {
                    System.out.println("FIZZ");
                }
            }
            else if(term % 5 == 0) {
                System.out.println("BUZZ");
            }
            else {
                System.out.println(term);
            }
        }
    }
}
