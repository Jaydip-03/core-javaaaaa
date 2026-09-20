package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class If_UpperLoverCase {
    static void main(String[] args) {

        System.out.println("Enter the Charecter " ) ;
        char ch = new Scanner(System.in).next().charAt(0) ;

        if (ch >= 65 && ch <= 90)
            System.out.println(ch + " :  is Uppercase Alphabete") ;
        if (ch >= 97 && ch <= 122)
            System.out.println(ch + " :  is Lowecae Alphabete") ;
        if (ch >= 48 && ch <= 57)
            System.out.println(ch  + " :  is Digit") ;
        if (! ((ch >= 65 && ch <= 90) || (ch >= 'a' && ch <= 'z') || (ch >= 48 && ch <= 57)))
            System.out.println(ch + " :  is special charecter") ;
    }
}
