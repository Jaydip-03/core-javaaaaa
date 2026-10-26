package TryAndError;

import java.util.Arrays;

public class FrequncyOfNumbers {
    static void main(String[] args) {

        int arr [] = {1,2,4,3,5,7,4,6,8,4,6,8,9,4,9} ;
        System.out.println(Arrays.toString(arr)) ;

        boolean [] b = new boolean[arr.length] ;

        for (int i=0 ; i<arr.length ; i++) {
            if (b[i]) {
                continue ;
            }

            int cnt = 1 ;

            for (int j=i+1 ; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++ ;
                    b[j] = true ;
                }
            }

            System.out.println(arr[i] + " : " + cnt) ;
        }
    }
}
