package TryAndError;

import java.util.Scanner;

public class HappyNumber {
    static void main(String[] args) {

        System.out.println("Enter the Number : ") ;
        int num = new Scanner(System.in).nextInt() ;

        while (true) {

            int sum = 0;

            while (num != 0) {
                int ld = num % 10;
                sum += ld * ld;
                num /= 10;
            }

            if (sum < 10) {
                break;
            }

            num = sum;
        }
    }
}
