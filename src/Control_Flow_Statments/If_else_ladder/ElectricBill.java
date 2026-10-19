package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {

        System.out.println("Check utr Electric Bill") ;

        System.out.println("Enter you bill unit") ;
        int unit = new Scanner(System.in).nextInt() ;

        if (unit < 0) {
            System.out.println("Invalid Unit") ;
            return ;
        }

        if (unit >=0 && unit <=100) {
            System.out.println("5rs Unit ") ;
            System.out.println("Your Bill is : " + (unit * 5)) ;
        }
        else if (unit >=101 && unit <= 200) {
            System.out.println("7Rs Unit") ;
            System.out.println("Your Bill is : " + (unit * 7)) ;
        } else if (unit >= 201 && unit <=300) {
            System.out.println("10Rs Unit");
            System.out.println("Your Bill is  : " + (unit * 10)) ;
        }
        else {
            System.out.println("15Rs Unit");
            System.out.println("Your Bill is  : " + (unit * 15)) ;
        }
    }
}
