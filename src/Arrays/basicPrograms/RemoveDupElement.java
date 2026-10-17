package Arrays.basicPrograms;

import java.util.*;

public class RemoveDupElement {
    public static  void main(String[] args) {

        int arr [] = {2,7,4,1, 5,6,3} ;

        System.out.println(Arrays.toString(arr)) ;

//        Set<Integer> set = new HashSet<>() ;
//        for (int a : arr ) {
//            set.add(a) ;
//        }
//
//        System.out.println(set) ;


        //-----------------------------------------------


        for (int i=0 ; i<arr.length ; i++) {
            for (int j=i+1; j<arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j] ;

                    arr[j] = arr [i] ;
                    arr[i] = temp ;

                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
