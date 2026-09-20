package Arrays.basicPrograms;

import java.util.Arrays;

public class PrintAndSumEvenElementsArray {
    static void main(String[] args) {

        int arr [] = new int [10] ;
        for (int i=0 ; i<arr.length; i++) {
            int num = (int) (Math.random() * 10) ;
            arr[i] = num ;
        }

        System.out.println(Arrays.toString(arr)) ;

        int evenSum = 0 ;
        int evenProduct = 1 ;
        for (int ele : arr){
            if (ele % 2 == 0) {
                evenSum += ele ;
                evenProduct *= ele ;
            }
        }

        System.out.println("Sum of even elemets  is : " + evenSum) ;
        System.out.println("Product of even elemets is : " + evenProduct) ;
    }
}
