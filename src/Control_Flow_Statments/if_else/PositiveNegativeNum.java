package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class PositiveNegativeNum {
    static void main(String[] args) {

        System.out.println("Enter the number : ") ;
        int num = new Scanner(System.in).nextInt() ;

        if (num > 0)
            System.out.println(num + " :  is Positive Number ") ;
        else
            System.out.println(num + " :  is neagtive  Number") ;
    }
}
