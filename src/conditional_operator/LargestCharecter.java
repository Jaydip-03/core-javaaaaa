package conditional_operator;

import java.util.Scanner;

public class LargestCharecter {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the charecter first second and thrd charecter ") ;
        char ch1 = sc.next().toLowerCase().charAt(0) ;

        char  ch2 = sc.next().toLowerCase().charAt(0) ;

        char ch3 = sc.next().toLowerCase().charAt(0) ;

        char larg = ch1>ch2 ? ch1>ch3 ? ch1:ch3 : ch2>ch3? ch2 : ch3 ;
        System.out.println("The largest charectr is " + larg)  ;






    }
}
