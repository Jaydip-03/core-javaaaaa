package conditional_operator;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {

        System.out.println("Enter ur number") ;
        int num = new Scanner(System.in).nextInt() ;

        boolean isPrime = true ;

        if (num <= 1)
            isPrime = false ;
        else {
            for (int i=2 ; i<num ; i++) {
                if (num %i == 0) {
                    isPrime = false ;
                    break ;
                }
            }
        }

        System.out.println(isPrime ? num+" : is Prime Number" : num+" : is not prime Number") ;
    }
}
