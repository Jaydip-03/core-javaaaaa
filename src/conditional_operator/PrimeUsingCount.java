package conditional_operator;

import java.util.Scanner;

public class PrimeUsingCount {
    static void main(String[] args) {

        System.out.println("Enter the number : ") ;
        int num = new Scanner(System.in).nextInt() ;

        int cnt = 0 ;
        for (int i=1 ; i<=num; i++) {
            if (num %i == 0)
                cnt++ ;
        }

        String ans = (cnt == 2) ? num+" : is prime Number " :  num+" : is Not Prime Number" ;
        System.out.println(ans) ;
    }
}
