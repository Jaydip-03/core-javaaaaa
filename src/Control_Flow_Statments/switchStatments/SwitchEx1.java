package Control_Flow_Statments.switchStatments;

import java.util.Scanner;

public class SwitchEx1 {
    static void main(String[] args) {

        System.out.println("Enter the number between 1 + 5 ") ;

        int num = new Scanner(System.in).nextInt() ;

        switch (num) {

            case 1 :
                System.out.println(num + " :  One ") ;
                break ;
            case 2 :
                System.out.println(num + " : Two ") ;
                break ;
            case 3 :
                System.out.println(num + " :  Three") ;
                break ;
            case 4 :
                System.out.println(num + " :  Four") ;
                break ;
            case 5 :
                System.out.println(num  + " :  Five") ;
                break ;
            default:
                System.out.println("Enter Right number nect time") ;
        }
    }
}
