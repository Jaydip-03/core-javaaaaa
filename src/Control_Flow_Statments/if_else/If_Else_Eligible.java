package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class If_Else_Eligible {
    static void main(String[] args) {

        System.out.println("Enter Youe Age budyyyy : ") ;
        int age = new Scanner(System.in).nextInt() ;

        if (age >= 18)
            System.out.println("you can Vote , Drive ") ;
        else
            System.out.println("you cannot Vote, Drive") ;
    }
}
