package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class PostiveNegative_Num {

    static void main() {
        System.out.println("Enter number to checkkkkkk ") ;
        int num = new Scanner(System.in).nextInt() ;

        if (num > 0)
            System.out.println(num + " :  is Positive Number") ;
        else
            System.out.println(num  + " :  is Negative Number ") ;
    }
}
