package conditional_operator;

import java.util.Scanner;

public class SpecialCharecter {

    static void main(String[] args) {

        System.out.println("Enter the charecter : ") ;
        char ch = new Scanner(System.in).next().charAt(0) ;

        String res = (!((ch >=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57))) ?
                ch+" : is Special Charecter" :
                ch+" : is  Not Special Charecter" ;

        System.out.println(res) ;
    }
}
