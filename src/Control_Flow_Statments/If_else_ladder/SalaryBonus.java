package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Take ur Bonus Budyyyyy ") ;

        System.out.println("Enter yor Experience") ;
        int experince = sc.nextInt() ;

        System.out.println("Enter you current Salary");
        double salary = sc.nextDouble() ;

        if (experince < 0 ||experince >= 100 || salary <= 0) {
            System.out.println("Invalid Input ") ;
            return ;
        }

        if (experince < 1) {
            System.out.println("Sorry , Company Dont provide for Less experince , u ll get Next Year") ;
        }
        else if (experince >=1 && experince <=3) {
            System.out.println("You ll get 5% Bonus ") ;
            System.out.println((salary * 5) / 100) ;
        }
        else if (experince >=4 && experince <=7) {
            System.out.println("You ll get 10% Bonus") ;
            System.out.println((salary * 10) / 100) ;
        }
        else {
            System.out.println("Youu ll get 15% Bonus") ;
            System.out.println((salary * 15)/ 100) ;
        }
    }
}
