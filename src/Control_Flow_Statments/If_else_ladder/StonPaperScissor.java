package Control_Flow_Statments.If_else_ladder;

import java.util.Scanner;

public class StonPaperScissor {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in) ;

        for (; ;) {
            System.out.println("\n --Welcome-- ") ;

            System.out.println("1: Ston , 2: Paper , 3: Scissor") ;
            System.out.println("Enter Your Option") ;
            int userOp = sc.nextInt() ;

            if (userOp <1 || userOp >3) {
                System.out.println("Invalid Option : Enter Correct Option") ;
                continue ;
            }

            String userResp = "" ;

            if (userOp == 1)
                userResp = "Ston" ;
            else if (userOp == 2)
                userResp = "Paper" ;
            else
                userResp = "Scissor" ;

            // Bot Creation
            int botOp;
            for (;;) {
                botOp = (int) Math.random() * 10 ;
                if (botOp >=1 && botOp <=3)
                    break ;
            }

            String botResp = "" ;

            if (botOp == 1)
                botResp = "Ston" ;
            else if(botOp == 2)
                botResp = "Paper" ;
            else botResp = "Scissor" ;

            System.out.printf("%n%10s %-10s%n", "USER","BOT");
            System.out.printf("%10s %-10s%n%n", userResp,botResp) ;


//            if (userResp.equals("Stone") && botResp.equals("Scissor") || w)


        }

    }
}
