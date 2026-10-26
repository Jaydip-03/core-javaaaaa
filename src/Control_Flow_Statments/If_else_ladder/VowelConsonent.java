package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {

        System.out.println("Enter Charecter : ") ;
        char ch = new Scanner(System.in).next().toLowerCase().charAt(0) ;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + "Is Vowel ") ;
        }
        else if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            System.out.println(ch + " : Consonet  ");
        }
        else {
            System.out.println(ch + ":  is other charecter ");
        }
    }
}
