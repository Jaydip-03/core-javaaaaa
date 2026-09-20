package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class ifExample3 {
    static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in) ;
        while (true) {
            int n = sc.nextInt() ;
            if (n % 2 == 0) {
                System.out.println(n +  " : Even number");
                break ;
            }
            System.out.println("Enter againnn");
        }
    }
}
