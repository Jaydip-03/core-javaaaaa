package Control_Flow_Statments.if_else;

import java.util.Scanner;

public class ResultPercenatege {
    static void main(String[] args) {

        System.out.println("Enter the Percenatge " ) ;

        double per = new Scanner(System.in).nextDouble() ;

        if (per >= 98)
            System.out.println(per +  " : Distinction well Doneeee  ") ;
        else if (per >= 85)
            System.out.println(per + " :  First classs budyyyyy" ) ;
        else if (per >= 80)
            System.out.println(per  + " :  seconde class ") ;
        else if (per >= 50)
            System.out.println(per  + " :  Third class");
        else if (per >= 35 )
            System.out.println(per  + " :  Passssss partyyyyyyy to banti haiiiii" ) ;
        else
            System.out.println("Koi na  paji Better luck next time ") ;
    }
}
