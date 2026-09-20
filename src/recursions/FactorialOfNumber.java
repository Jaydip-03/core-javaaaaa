package recursions;

import java.util.Scanner;

public class FactorialOfNumber {

    static  int fact = 1 ;
    static int fact2 = 1 ;
    static void main(String[] args) {
        System.out.println("Enter the number " ) ;
        int num = new Scanner(System.in).nextInt() ;

        calFactorial(num, 1) ;
        System.out.println(fact) ;

        System.out.println(factorial(num, 1)) ;
    }

    public static void  calFactorial(int num, int i) {
        fact = fact * i ;
        i++ ;

        if (i > num) {
            return ;
        }

        calFactorial(num, i) ;

    }

    public static int factorial(int num, int i) {

        fact2 *= i ;
        i++ ;
        if (i>num) {
            return fact2 ;
        }

        return factorial(num, i ) ;
    }

}
