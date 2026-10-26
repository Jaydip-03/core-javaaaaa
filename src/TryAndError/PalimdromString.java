package TryAndError;

import java.util.Scanner;

public class PalimdromString {
    public static void main(String[] args) {

        System.out.println("Enter a String") ;
        String str = new Scanner(System.in).next() ;

        if (isPalimdrom(str)) {
            System.out.println(str +" :  is palimdrom") ;
        }
        else {
            System.out.println(str + " :  is not Palimdrom") ;
        }


    }

    public static boolean isPalimdrom(String str) {

        for (int i=0 , j=str.length()-1; i<j ; i++,j--) {

            if (str.charAt(i) != str.charAt(j)) {
                return false ;
            }
        }

        return true ;
    }
}
