package recursions;

import java.util.Scanner;

public class ReveseNumber {
    static void main(String[] args) {

        System.out.println("Enter th number for revrse ") ;
        int num = new Scanner(System.in).nextInt() ;

        System.out.println(revreseNum(num, 0)) ;

//        System.out.println(reverseNumber(1234, 0));


    }

    public static int revreseNum(int num, int rev) {

        rev = (rev * 10) + num % 10 ;
        num = num / 10 ;

        if (num == 0){
            return  rev ;
        }

        return  revreseNum(num, rev) ;
    }

    public static int reverseNumber(int num, int rev) {
        rev = (rev * 10) + num % 10 ;
        num = num / 10 ;

        if (num == 0)
            return rev ;

        return  reverseNumber(num, rev) ;
    }
}
