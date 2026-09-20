package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class If_Else_Eligible2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter ur Age " ) ;
        int age = sc.nextInt() ;

        System.out.println("Enter ur salary") ;
        double salary = sc.nextDouble() ;

        System.out.println("Enter ur Surname") ;
        String surName = sc.next().toLowerCase() ;

        if ((age >= 21 && (salary >= 500000  || surName.equals("patil"))))
            System.out.println("Congratulation ur eleible for marriage") ;
        else
            System.out.println("U cannot marrrige Stay Sinle forever ") ;
    }
}
