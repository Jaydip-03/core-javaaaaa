package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        System.out.println("Calculate Your Discount") ;

        System.out.println("Enter Purchase Ammount") ;
        double amt = new Scanner(System.in).nextDouble() ;

        double discount = 0 ;

        if (amt < 0) {
            System.out.println("Invalid Amount") ;
            return ;
        }

        if (amt < 1000) {
            System.out.println("Sorry No Discount on purchase of less than 1000") ;
        }
        else if (amt >= 1000 && amt <=4999) {
            discount = ((amt * 5) / 100) ;
            System.out.println("Original Discount is : " + discount) ;
            System.out.println("Toal Price is : " + amt) ;
            System.out.println("Price After Discount : " + (amt -= discount)) ;
        }
        else if (amt >= 5000 && amt <=9999) {
            discount = ((amt * 10) / 100) ;
            System.out.println("Original Discount is : " + discount) ;
            System.out.println("Toal Price is : " + amt) ;
            System.out.println("Price After Discount : " + (amt -= discount)) ;
        }
        else if (amt >= 10000 && amt <=19999) {
            discount = ((amt * 15) / 100) ;
            System.out.println("Original Discount is : " + discount) ;
            System.out.println("Toal Price is : " + amt) ;
            System.out.println("Price After Discount : " + (amt -= discount)) ;
        }
        else {
            discount = ((amt * 20) / 100) ;
            System.out.println("Original Discount is : " + discount) ;
            System.out.println("Toal Price is : " + amt) ;
            System.out.println("Price After Discount : " + (amt -= discount)) ;
        }
    }
}
