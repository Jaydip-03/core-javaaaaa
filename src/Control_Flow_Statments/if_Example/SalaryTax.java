package Control_Flow_Statments.if_Example;
import java.util.Scanner ;
public class SalaryTax {

    static void main(String[] args) {

        System.out.println("Enter the salary : ");
        double salary = new Scanner(System.in).nextDouble() ;

        int  tax = 0 ;
        if (salary >=500000 && salary < 600000)
            tax = (int) (salary * 25) / 100 ;
        if (salary > 600000 && salary <=700000)
            tax =(int)  (salary * 0.30) ;
        if (salary > 700000)
            tax =(int)  (salary * 33) / 100 ;
        System.out.println("Tax on :  " + salary + " : is " + tax );



    }
}
