package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the Number 1 ") ;
        double num1 = sc.nextDouble() ;

        System.out.println("Enter number 2") ;
        double num2 = sc.nextDouble() ;

        System.out.println("Enter the operator") ;
        char ch = sc.next().charAt(0) ;

        if (ch == '+') {
            System.out.println("Addition of Two Number is : " + (num1 + num2) ) ;
        }
        else if (ch == '-') {
            System.out.println("Subtraction of two number is : " + (num1 - num2) );
        }
        else if (ch == '*') {
            System.out.println("Product of twwo number is : " + (num1 * num2)) ;
        }
        else if (ch == '/') {
            System.out.println("Division of two number is : " + (num1 / num2)) ;
        }
        else if (ch == '%') {
            System.out.println("Remainder of two number id : " + (num1 % num2)) ;
        }
        else {
            System.out.println(ch + " is invalid operator ") ;
        }
    }
}
