package TryAndError;

import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {

        System.out.println("Enter the String : ") ;
        String str = new Scanner(System.in).next() ;

        String newStr = "" ;

        for (int i=str.length()-1; i>=0 ; i--) {
            newStr+= str.charAt(i) ;

        }

        System.out.println(newStr) ;
    }
}
