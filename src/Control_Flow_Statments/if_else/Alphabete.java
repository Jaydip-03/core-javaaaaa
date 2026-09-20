package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class Alphabete {
    static void main(String[] args) {

        System.out.println("Eneter the Charecter ") ;
        char ch = new Scanner(System.in).next().charAt(0) ;

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println(ch  + " :  is Alphabet") ;
        else
            System.out.println(ch + " :  is not alphabet" ) ;
    }
}
