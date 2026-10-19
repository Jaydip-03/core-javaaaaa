package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        System.out.println("Helooo Studenttttsssss") ;

        System.out.println("Enter Your Marks") ;
        int marks = new Scanner(System.in).nextInt() ;

        if (marks <0 || marks >500.0) {
            System.out.println("Invalid Marks" ) ;
            return ;
        }

        double percentage = 0 ;
        if (marks >= 490) {
            percentage = ((marks / 500.0) * 100) ;
            System.out.println("Outstanding : " + percentage ) ;
        }
         else if (marks >= 380 && marks <= 490) {
             percentage = ((marks / 500.0) * 100) ;
            System.out.println("Excelent" + percentage) ;
        }
         else if (marks >= 250 && marks <= 380 ) {
             percentage = ((marks / 500.0) * 100) ;
            System.out.println("Good: " + percentage ) ;
        }
         else if (marks >=180 && marks <= 250) {
            percentage = ((marks / 500.0) * 100) ;
            System.out.println("Passs : " + percentage) ;
        }
         else {
            System.out.println("Faill : Better Luck next Time ") ;
        }

    }
}
