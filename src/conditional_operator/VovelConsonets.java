package conditional_operator;

import java.util.Scanner;

public class VovelConsonets {
    static void main(String[] args) {

        System.out.println("Enter the Alphabet") ;

        char ch = new Scanner(System.in).next().toLowerCase().charAt(0) ;

        if (! (ch >=97 && ch <= 122)){
            System.out.println("Your enter woring chr pls Enter Alphabet") ;
        }
        else {
            String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ?
                    ch + " :  is vowel" :
                    ch + " :  is Consonets" ;

            System.out.println(res) ;
        }
    }
}
