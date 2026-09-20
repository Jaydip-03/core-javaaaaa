package Programing.BasicProgramss;

import java.util.Scanner;

public class SalaryBonus {
    static void main(String[] args) {

        System.out.println("Enter the salaryyyyy  : ") ;
        double salary = new Scanner(System.in).nextDouble() ;

        double bonus = 0 ;

        if (salary > 1200000) {
            bonus = (salary * 10) / 100 ;
            salary += bonus ;
            System.out.println("Your Bonus is : " + bonus) ;
            System.out.println("Your Total salary is : " + salary) ;

        }

        if (salary >= 900000 && salary <1200000) {
            bonus = (salary * 9 ) / 100 ;
            salary = salary + bonus ;
            System.out.println("Your bonus is : " + bonus) ;
            System.out.println("Your total ssalary is : " + salary) ;
        }

        if (salary >= 700000 && salary < 900000) {
            bonus = salary *0.07 ;
            salary = salary + bonus ;
            System.out.println("Your bonus is : " + bonus) ;
            System.out.println("Your salary is : " + salary) ;
        }

        if (salary >=1000 && salary <= 700000) {
            bonus = (salary * 5) / 100 ;
            salary += bonus ;
            System.out.println("Your bonus is  : " + bonus) ;
            System.out.println("Your salary is : " + salary) ;
        }
    }
}
