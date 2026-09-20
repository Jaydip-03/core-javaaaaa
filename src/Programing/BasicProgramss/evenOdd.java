package Programing.BasicProgramss;

import java.util.Scanner;

public class evenOdd {
    static void main(String[] args) {

        System.out.println("Enter the number to check : ") ;
        int num  = new Scanner(System.in).nextInt() ;

        if (num % 2 == 0)
            System.out.println(num + " :  is even number ") ;
        else
            System.out.println(num + " : is odd number ") ;
    }
}
