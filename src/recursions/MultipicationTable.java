package recursions;

import java.util.Scanner;

public class MultipicationTable {
    static void main(String[] args) {

        System.out.println("Enter the number : " );
        int num = new Scanner(System.in).nextInt() ;

        printTable(num, 1) ;
    }

    public static void printTable(int num, int n) {
        System.out.println(num + " * "+  n +" = " + num * n) ;
        n++ ;

        if (n > 10) {
            return ;
        }
        printTable(num, n) ;


    }
}
