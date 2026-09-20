package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class VowelConsonets {
    static void main(String[] args) {

        System.out.println("Enter the charecter  : ") ;
        char ch = new Scanner(System.in).next().toLowerCase().charAt(0) ;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " :  id Vowels ") ;

        if (! (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
            System.out.println(ch + " : is Consonets") ;
    }
}
