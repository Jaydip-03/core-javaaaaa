package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class GrafeCalculater {
   public static void main(String[] args) {

       System.out.println("Enter the Marksss") ;
       int marks = new Scanner(System.in).nextInt() ;

       if (marks <=0) {
           System.out.println("Invalid Markssss") ;
           return ;
       }

       if (marks >= 90)
           System.out.println("Your Grade is : A+") ;
       else if (marks>=80 && marks<=89)
           System.out.println("Your grade is :  A") ;
       else if(marks>=70 && marks<=79)
           System.out.println("Your Grade is : B") ;
       else if(marks>=60 && marks<=69)
           System.out.println("Ypur Grade is : C") ;
       else if(marks>=50 && marks<=59)
           System.out.println("Your Grade is : D") ;
       else
           System.out.println("Failll : Better Luck next time") ;
   }
}
