package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class ifEx_Number_Divisible {
    static void main(String[] args) {

        System.out.println("Enter the number  : ") ;
        int num = new Scanner(System.in).nextInt() ;

        if (num %2 ==0 && num %5 == 0) {
            System.out.println("hi Fiveeee and Twoo") ;
        }
        if (num %2 == 0 && num %5 !=0) {
            System.out.println("Hiii Two") ;
        }
        if (num %5 == 0 && num %2 != 0) {
            System.out.println("Hiii Five") ;
        }


        // secont way to write this program used return keyword

        if (num %2==0 && num %5 ==0) {
            System.out.println("hiii five , Two") ;
            return ;
        }
        if (num %2 == 0 && num %5!=0) {
            System.out.println("Hiiii two") ;
            return ;
        }
        if (num%5==0 && num %2!=0) {
            System.out.println("Hiii Five") ;
            return ;
        }
    }
}
