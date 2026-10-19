package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class Temperature {
    public static void main(String [] args) {

        System.out.println("Heyy Guys Check Trmperatute ") ;

        System.out.println("Enter the Temperature") ;
        float temp = new Scanner(System.in).nextFloat() ;

        if (temp >= 40) {
            System.out.println("Very Hot");
        }
        else if (temp >=30 ) {
            System.out.println("Hot") ;
        }
        else if (temp >= 20 ) {
            System.out.println("Normal") ;
        }
        else if (temp >= 10) {
            System.out.println("Cold");
        }
        else {
            System.out.println("Very Cold ") ;
        }
    }
}
