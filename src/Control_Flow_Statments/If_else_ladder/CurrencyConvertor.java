package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class CurrencyConvertor {
    static void main(String[] args) {

        System.out.println("*** Wecome to CurrencyConverot ***") ;
        System.out.println("--- FAST --- MODERN --- ADVANCED ---") ;

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the Amount INR ") ;
        double inr =  sc.nextDouble() ;

        System.out.println("\n Choose Currency to Convert") ;
        System.out.println("USD :  - us Doller ") ;
        System.out.println("GPB :  - British Pound") ;
        System.out.println("EURO : - Euro") ;
        System.out.println("KWD : - Kuwati Dinar") ;
        System.out.println("CAD : - Canadian Doller") ;
        System.out.println("AUD : - Austrelian Doller") ;

        System.out.println("Enter Currency Code") ;
        String op = sc.next().toUpperCase() ;

        double convertedCurr = 0 ;
        boolean validCurrency = true ;

        if (op.equals("USD")) {
            convertedCurr = inr / 95.50 ;
        }
        else if (op.equals("GPB")) {
            convertedCurr = inr / 122.25 ;
        }
        else if (op.equals("EURO")) {
            convertedCurr = inr / 106.33 ;
        }
        else if (op.equals("KWD")) {
            convertedCurr = inr / 292.09 ;
        }
        else if (op.equals("CAD")) {
            convertedCurr = inr / 65.72 ;
        }
        else if (op.equals("AUD")) {
            convertedCurr = inr / 60.14 ;
        }
        else {
            System.out.println("Invalid Currency : " + op) ;
            validCurrency = false ;
        }

        if (validCurrency) {
            System.out.printf("INR %.2f = %s %.2f%n" , inr , op ,  convertedCurr) ;
        }


    }
}
