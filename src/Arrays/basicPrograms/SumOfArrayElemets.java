package Arrays.basicPrograms;

import java.util.Arrays;

public class SumOfArrayElemets {
    static void main(String[] args) {

        int arr [] = new  int[10] ;
        for (int i=0; i<arr.length ; i++) {
            arr[i] = (int) (Math.random() * 10) ;
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0 ;
//        int i=0 ;
//        while (i<arr.length) {
//            sum += arr[i] ;
//            i++ ;
//        }

        for (int ele : arr)
            sum+= ele ;

        System.out.println(sum) ;


        System.out.println("Sum of elemets id Arayy is : " + sum) ;
    }
}
