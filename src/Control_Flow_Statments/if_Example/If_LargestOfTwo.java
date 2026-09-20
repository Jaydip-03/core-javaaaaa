package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class If_LargestOfTwo {
    static void main(String[] args) {

        System.out.println("Enter the number  : ") ;
        int num1 = new Scanner(System.in).nextInt() ;

        System.out.println("Enter The Second number  : ") ;
        int num2 = new Scanner(System.in).nextInt() ;

        if (num1 > num2)
            System.out.println(num1 + " :  is Greter ") ;
        if (num2 > num1)
            System.out.println(num2 + " :  is Greter ") ;
    }
}
