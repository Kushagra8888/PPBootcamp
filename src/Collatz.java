/**
 * Created by test on 7/20/2015.
 */
public class Collatz {
    private int term;
    private int count;

    public Collatz(int startTerm) {
        this.term = startTerm;
        this.count = 1;
    }

    public boolean hasNext() {
        return !((term == 1) && (count > 3));
    }

    public int next() {
        if (count == 1){
            count += 1;
            return term;
        }
        term = (term % 2 == 0) ? term / 2 : term * 3 + 1;
        count += 1;
        return term;
    }

    public void Print(){
        while (hasNext()) {
            System.out.println(next());
        }
    }

    public int Sum(){
        int sum = term;
        while (hasNext()) {
            sum += next();
        }
        return sum;
    }

    public static int largestPowOfTwo(Collatz CollatzSeq) {
        int term;
        while(CollatzSeq.hasNext()) {
            term = CollatzSeq.next();
            if (powerOfTwo.isPowerOfTwo(term)){
                return term;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Collatz CollatzSeq = new Collatz(57);
        CollatzSeq.Print();
        //System.out.println(Collatz.largestPowOfTwo(CollatzSeq));

    }
}
