package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class IfExample6 {
    static void main(String[] args) {

        System.out.println("Welcome to Peter Consultansy : ") ;
        System.out.println("Didi you fill the form ") ;

        String responce = new Scanner(System.in).nextLine().toLowerCase() ;

        if (responce.equals("yes")) {
            System.out.println("You ll get mail for next process Thanksss") ;
        }

        System.out.println("Visti Agan") ;
    }
}
