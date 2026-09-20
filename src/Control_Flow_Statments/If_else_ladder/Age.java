package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class Age {
   public static void main(String[] args) {

       System.out.println("Enter the Age") ;
       int age = new Scanner(System.in).nextInt() ;
       if (age < 0) {
           System.out.println("Invalid Age") ;
           return ;
       }

       if (age >= 18) {
           System.out.println("You are Adult\n you can vote , Drive") ;
       } else if (age >=13 && age <= 17) {
           System.out.println("You are Teenager") ;
       } else if (age >= 6 && age <=12) {
           System.out.println("You are child ready for school") ;
       }
       else {
           System.out.println("You arebabyyyyyy") ;
       }
   }
}
