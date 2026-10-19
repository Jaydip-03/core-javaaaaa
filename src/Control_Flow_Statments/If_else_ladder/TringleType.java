package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class TringleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter Your side a") ;
        double a = sc.nextDouble() ;

        System.out.println("Enter side b") ;
        double b = sc.nextDouble() ;

        System.out.println("Enter side c") ;
        double c = sc.nextDouble() ;


        if ((a + b) > c) {
            System.out.println("");
        }
    }
}
