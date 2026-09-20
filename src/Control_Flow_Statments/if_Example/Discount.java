package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class Discount {
    static void main(String[] args) {

        System.out.println("Enter the totol bill") ;

        double bill = new Scanner(System.in).nextDouble() ;

        if (bill >= 1000)
            bill = bill -  (bill * 10 / 100) ;

        System.out.println("Total bill is : " + bill) ;
    }
}
