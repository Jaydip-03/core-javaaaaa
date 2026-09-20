package Control_Flow_Statments.if_Example;

import java.util.Scanner;

public class IfExample {
    static void main(String[] args) {

        System.out.println("Enter the standard you are studing " ) ;
        int std = new Scanner(System.in).nextInt() ;

        if (std >= 1 && std <= 12) {
            System.out.println("ur studing in school or high-school");
        }
        System.out.println("Study well " ) ;

    }
}
