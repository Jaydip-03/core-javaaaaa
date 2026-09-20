package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class CheckVowels {
    static void main(String[] args) {

        System.out.println("Enter the chrecter  : ") ;
        char ch = new Scanner(System.in).next().toLowerCase().charAt(0) ;

        if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " :  is vowel") ;
            return ;
        }
        System.out.println(ch +  " :  is consonents " ) ;

    }
}
