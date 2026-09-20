package conditional_operator;

import java.util.Scanner;

public class LargestOfThree {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the first Number ") ;
        int num1 = sc.nextInt() ;
        System.out.println("Enter the Second Number") ;
        int num2 = sc.nextInt() ;
        System.out.println("Enter the Third Number ") ;
        int num3 = sc.nextInt() ;

        int largest = num1 > num2 ? (num1 > num3 ? num1 : num3 ) : num2 > num3 ? num2 : num3 ;

        System.out.println("The Largets of three is is " + largest ) ;
    }
}
