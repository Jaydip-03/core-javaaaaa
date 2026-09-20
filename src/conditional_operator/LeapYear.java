package conditional_operator;

import java.util.Scanner;

public class LeapYear {
    static void main(String[] args) {

        System.out.println("Heyyy mittar Enter Year") ;
        int year = new Scanner(System.in).nextInt() ;

        String ans = ((year%100 != 0 || year %400 == 0) && year %4 == 0) ?
                year + " : is Leap Year" :
                year + " :  is not leap Year" ;

        System.out.println(ans);
    }
}
