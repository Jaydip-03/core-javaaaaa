package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class LeapYear {
    static void main(String[] args) {

        System.out.println("Enter the Year") ;
        int year = new Scanner(System.in).nextInt() ;

        if ((year % 100 !=0 || year % 400 == 0) && year % 4 == 0 )
            System.out.println(year + " :  is Leap Year") ;

        if (!((year % 100 !=0 || year % 400 == 0) && year % 4 == 0))
            System.out.println(year + " : is not leap yeap") ;
    }
}
