package TryAndError;

import java.util.Scanner;

public class Fibnaci {
    static void main(String[] args) {

        System.out.println("Enter the number ") ;
        int iteration = new Scanner(System.in).nextInt() ;

        int target = 10 ;
        int num1 = 0 ;
        int num2 = 1 ;

        int num3 ;

        int sum = 0 ;

        for (;;) {
             num3 = num1 + num2 ;
            System.out.println(num3) ;
            sum += num3 ;

            num1 = num2 ;
            num2 = num3 ;

            if (sum > target) {
                break ;
            }
        }
    }
}
