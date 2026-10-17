package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class Evm {

    static  int cong , ss , mns , nsc , bjp , nota ;

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("-- Electronic Voting Machine -- ") ;
        System.out.println("** Your Vote Can Change The Future **") ;

        System.out.println("Note : Please Don't Vote BJP , BCZ They are Vote Chor  ") ;

        System.out.println("Enter Population ") ;
        int population = sc.nextInt() ;

        if (population <= 0) {
            System.out.println("Invald Population ") ;
            return ;
        }



        for (int i=1; i<=population; i++) {
            System.out.println("~~ EVM ~~") ;
            System.out.println("List of Parties") ;

            System.out.println("1 : Cong") ;
            System.out.println("2 : SS") ;
            System.out.println("3 : Nsc") ;
            System.out.println("4 : Mns") ;
            System.out.println("5 : Bjp") ;
            System.out.println("6 : Nota") ;

            System.out.println("Enter Your Vote ") ;
            int op = sc.nextInt() ;

            if (op == 1) {
                cong++ ;
                System.out.println("You have Vote Congress , Bharat Jodo") ;
            }
            else if (op == 2) {
                System.out.println("You have vote Shivsena") ;
                System.out.println("Maharastrachi Sena (UBT)") ;
            }
            else if (op == 3) {
                System.out.println("You have Vote Rastrawadi ") ;
                System.out.println("Rastrawadi punha") ;
            }
            else if (op == 4) {
                System.out.println("You have vote MANASE") ;
                System.out.println("Marathi Manasacha Aawaj") ;
            }
            else if (op == 5) {
                System.out.println("You have vote BJP , Ur Andhbhakt") ;
                System.out.println("Dharm ke nam pe desh luto") ;
            } else if (op == 6) {
                System.out.println("You have voted non of therm") ;
            }
            else {
                System.out.println("Invaid option") ;
                i-- ;
            }

        }

        if (cong >= ss && cong >= mns && cong >= nsc && cong >= bjp && cong >= nota) {
            System.out.println("Congress is Won by " + cong + " : Votes") ;
        }
        else if (ss >= cong && ss >= mns && ss >= nsc && ss >= bjp && ss >= nota) {
            System.out.println("Shivsena (UBT) Won by " + ss + " :Votes") ;
        }
        else if (nsc >= cong && nsc >= ss && nsc >= mns && nsc >= bjp && nsc >= nota) {
            System.out.println("Rastrawadi Won By " + nsc + ": Votes") ;
        }
        else if (mns >= cong && mns >= ss && mns >= nsc && mns >= bjp && mns >= nota) {
            System.out.println("MNS Wonbya " + mns + " :Votes") ;
        }
        else {
            System.out.println("No one won election ") ;
        }


    }
}
