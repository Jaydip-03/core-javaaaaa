package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class IfEx_Eligible_marks {
    static void main(String[] args) {

        System.out.println("Enter the marks bruhhh") ;

        int marks = new Scanner(System.in).nextInt() ;

        if (marks >= 60 && marks <= 100) {
            System.out.println("Yuppp u r Eligible") ;
            return ;
        }
        if (marks < 60)
            System.out.println("Soryy u r not eligible") ;
    }

}
