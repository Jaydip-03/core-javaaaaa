package conditional_operator;

import java.util.Scanner;

public class UpperLowerCaseAlphabet {
    static void main(String[] args) {

        System.out.println("Enter the Charecter") ;
        char ch = new Scanner(System.in).next().charAt(0) ;

        String ans = ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) ? ch+" : Alphabeter" : ch+" : is not Alphabete" ;

        System.out.println(ans) ;
    }
}
