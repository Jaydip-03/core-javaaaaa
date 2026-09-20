package Arrays.basicPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InitializeArray {
    static void main(String[] args) {

        // fiest way
        char [] arr = new char[26] ;
        char ch = 'a' ;
        for (int i=0; i<arr.length ; i++) {
            arr[i] = ch++ ;
        }
        System.out.println(Arrays.toString(arr)) ;



        // another way
        char alphabets [] = new char[26] ;
        for (int i=0 ; i<alphabets.length ; i++) {
            alphabets[i] = (char) (i+65) ;
        }
        System.out.println(Arrays.toString(alphabets));



        // another way
        String alphas [] = new String[26] ;
        char ch1 = 'A' ;
        char ch2 = 'a' ;
        for (int i=0; i<alphas.length; i++, ch1++, ch2++) {
            alphas [i] = " " +ch1 + ch2 ;
//            ch1++;
//            ch2++;
        }
        System.out.println(Arrays.toString(alphas));


        String arr2 [] = new String[26] ;
        for (int i=0; i<arr2.length ; i++) {
            arr2[i] =  ""+ (char)(i+65)+ (char) (i+97) ;
        }
        System.out.println(Arrays.toString(arr2)) ;


        char chrrs [] = new char[26] ;
        for (char c='A' ; c<='Z'; c++) {
            chrrs[c-65] = (char)(c+32) ;
        }
        System.out.println(Arrays.toString(chrrs));

        char arr3 [] = new char[26] ;
        for (char j='a'; j<='z'; j++) {
            arr3[j-97] = (char) (j-32) ;
        }
        System.out.println(Arrays.toString(arr3)) ;

    }
}
