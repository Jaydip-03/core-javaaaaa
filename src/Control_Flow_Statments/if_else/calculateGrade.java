package Control_Flow_Statments.if_else;
import java.util.Scanner ;
public class calculateGrade {
   public static void main(String[] args) {

        System.out.println("Enter ur markss : ") ;
        int marks = new Scanner(System.in).nextInt() ;


        if (marks < 0 || marks > 500){
            System.out.println("Invalid marks  ");
            return ;
        }

        double percentage = 0 ;

        if (marks > 480) {
//            percentage = ((marks / 500.0) * 100 );
            System.out.println("ur percentahe is : " + (marks / 500.0) * 100) ;
            System.out.println("You obtaine :  A+ grade") ;
        }
        else if (marks >440 && marks <480) {
            System.out.println("Your Percentage is :  " + ((double)marks / 500 * 100)) ;
            System.out.println("You obtaine  : A Grade") ;
        }
        else if (marks > 380 && marks < 440) {
            System.out.println("Your Percenatge is : " + (marks / 500.0) * 100) ;
            System.out.println("You obtaine B Grade" ) ;
        }
        else if (marks >250 && marks < 380 ) {
            System.out.println("Your percentage is : " + (marks / 500.0) *  100) ;
            System.out.println("You Obtaine C Grade ") ;
        }
        else {
            System.out.println("Fail : ") ;
            System.out.println("Better luck next Time. Try Hard ") ;
        }


    }
}
