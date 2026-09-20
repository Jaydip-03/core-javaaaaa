package Control_Flow_Statments.if_else;
import  java.util.Scanner ;
public class AgeCategory {
    static void main(String[] args) {
        System.out.println("Enter Your Age : ");
        byte age = new Scanner(System.in).nextByte() ;
        
        if (age < 0 || age > 150){
            System.out.println("Invalid age ");
            return ;
        }
        else if (age > 18 )
            System.out.println("You are  Adult \n you cane Vote \n you can drive \n you can study higher  .. .. ..") ;
        else if (age >= 13 && age < 18)
            System.out.println("Yor are Teenager ");
        else if (age > 5 && age < 13) {
            System.out.println("You are Small Kidss ");
        }
        else
            System.out.println("You are Babiesss ");

    }
}
