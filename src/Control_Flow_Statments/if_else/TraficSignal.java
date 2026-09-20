package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class TraficSignal {
    static void main(String[] args) {

        System.out.println("Heyyy follo the rules for Drive") ;
        System.out.println("Happy journeyyy") ;

        String signal = new Scanner(System.in).nextLine() ;

         if (signal.equals("red"))
             System.out.println("Stop dont goooo") ;
         if (signal.equals("yello"))
             System.out.println("Redy for leave ");
         if (signal.equals("green"))
             System.out.println("You can goo") ;
    }
}
