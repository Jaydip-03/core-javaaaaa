package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        System.out.println("Enter Number ") ;
        int number = new Scanner(System.in).nextInt() ;

        if (number < 0) {
            System.out.println(number + " :  is Negative Number");
        }
        else if (number % 2 == 0) {
            System.out.println(number + " : is Even Number , Positive Number") ;
        }
        else if (number %2 !=0) {
            System.out.println(number + " : Odd Number, Positive Number ") ;
        }
        else {
            System.out.println("Neither Positive or Negative") ;
        }

    }
}
