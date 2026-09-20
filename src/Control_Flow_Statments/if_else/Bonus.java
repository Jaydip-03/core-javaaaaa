package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class Bonus {
    static void main(String[] args) {

        System.out.println("Enter the salary : : : ") ;
        double salary = new Scanner(System.in).nextDouble() ;

        if (salary <= 0) {
            System.out.println("invalid salary") ;
            return ;
        }

        double bonus = 0 ;

        if (salary >= 50000) {
            bonus =  salary + ((salary * 10) / 100) ;
        }
        else
            bonus = salary + (salary *0.05) ;

        System.out.println(bonus+ " :  is ur bonus") ;
    }
}
