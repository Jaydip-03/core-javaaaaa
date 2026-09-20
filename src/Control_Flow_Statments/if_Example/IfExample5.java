package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class IfExample5 {
    static void main(String[] args) {

        System.out.println("Enter the number " ) ;
        int num = new Scanner(System.in).nextInt() ;

        while (true) {
            if (num % 2 != 0) {
                System.out.println(num + " :  is odd number  " ) ;
                break ;
            }
            num = new Scanner(System.in).nextInt() ;
        }
    }
}
