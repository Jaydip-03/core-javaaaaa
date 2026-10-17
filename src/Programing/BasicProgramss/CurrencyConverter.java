package Programing.BasicProgramss;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println(" \n *** Welcome to currency Converter ***") ;
        System.out.println("-- Moder -- Fats -- Advanced -- ") ;

        System.out.println("1 : INR to Foreign Currency ") ;
        System.out.println("2 : Foreign currency to INR") ;

        int direction = sc.nextInt() ;

        System.out.println("Enter The Ammount inr") ;
        double inr = sc.nextDouble() ;

        System.out.println("Enter Currency Code : ") ;
        System.out.println("USD , GBP , EURO ") ;

        String op = sc.next().toUpperCase() ;

        double rate = 0 ;

        if (op.equals("USD")) {
            rate = 95.45 ;
        }
        else if (op.equals("GBP")) {
            rate = 122.25 ;
        }
        else if (op.equals("EURO")) {
            rate = 106.33 ;
        }
        else {
            System.out.println("Invalid Currency ") ;
            return ;
        }

        double result = 0 ;

        if (direction == 1) {
            result = inr / rate ;
        } else if (direction == 2) {
            result = inr * rate ;
        }
        else  {
            System.out.println("Invalid Direction");
            return ;
        }

        System.out.println("Converted Ammount : " + result) ;


    }
}
