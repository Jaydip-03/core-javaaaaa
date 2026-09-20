package conditional_operator;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {

        System.out.println("Enter the number Paajiii" ) ;
        int num = new Scanner(System.in).nextInt() ;

        String ans = num %2 == 0 ? "Even Number " :  "Odd Number" ;
        System.out.println(ans) ;
    }
}
