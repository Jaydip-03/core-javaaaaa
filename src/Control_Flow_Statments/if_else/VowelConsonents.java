package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class VowelConsonents {
    static void main(String[] args) {

        System.out.println("Enter the charecter") ;
        char ch = new Scanner(System.in).next().toLowerCase().charAt(0) ;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " :  is Vowel ");
        }
        else
            System.out.println(ch + " :  is consonets") ;
    }
}
