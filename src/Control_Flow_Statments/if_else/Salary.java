package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class Salary {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ut Salaryyy Paaji") ;
        double salary = sc.nextDouble() ;

        System.out.println("Enter Score of performance " ) ;
        int score = sc.nextInt() ;

        if (score <0 || score >= 100) {
            System.out.println("Invalid Scoreee pls Try Again ") ;
            return ;
        }

        double dupSal = salary ;
        if (score >= 90)
            salary = salary + (salary * 3 / 100) ;
        else salary = salary + (salary * 1 / 100) ;

        System.out.printf("Previous salary : %.2f,  Reavise Salary :  %.2f ", dupSal ,  salary) ;
    }
}
