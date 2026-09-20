package recursions;

public class FindFactors {
    static void main(String[] args) {

        findFact(6, 1) ;
    }
    public static void findFact(int num, int i) {
        if (num % i == 0) {
            System.out.println(i + " : ") ;
        }
        if (i == num) {
            return ;
        }

        // recursive call
        findFact(num, ++i) ;
    }
}
