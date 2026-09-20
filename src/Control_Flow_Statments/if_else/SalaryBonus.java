package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class SalaryBonus {
    static void main(String[] args) {

        System.out.println("Enter th salaryyyyyy : ") ;
        double salary = new Scanner(System.in).nextDouble() ;
        if (salary < 0)
            return ;

        double bonus = 0 ;
        double bonusSalary = 0 ;

        if (salary  > 1500000) {
            bonus = 40000 ;
            bonusSalary = bonus + salary ;
            System.out.println("Salary is + : " + salary + " : bonus : " + bonus + " :  and total salary and bonys is : " + bonusSalary) ;

        }
        else  if (salary > 1200000 && salary < 1500000) {
            bonus = 30000 ;
            bonusSalary = salary + bonus ;
            System.out.println("Salary is : " + salary + " bonus : " + " Total salary and bonus is : " + bonusSalary) ;
        } else if (salary > 700000 && salary < 1200000) {
            bonus = 25000 ;
            bonusSalary = bonusSalary + bonus ;
            System.out.println("Salary is : " + salary + " Bonus is : " + bonus + " : Toatal salary and bonus  is : " + bonusSalary) ;
        }
        else {
            bonus = 20000 ;
            bonusSalary = salary + bonus ;
            System.out.println("Salary is : " + salary + " Bonus is : " + bonus + " Total salary and bonus is : " + bonusSalary) ;
        }


    }
}
