package conditional_operator;

import java.util.Scanner;

public class UppercaseAlpha {
    static void main(String[] args) {

        System.out.println("Enter the Charecter : ") ;
        char ch = new Scanner(System.in).next().charAt(0) ;

        String ans = ch>=65 && ch <=90 ? ch+" : is Uppercase Alphabete" : ch+": is not Uppercase Alphabet" ;

        System.out.println(ans) ;
    }
}
