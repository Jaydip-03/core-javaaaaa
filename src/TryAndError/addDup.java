package TryAndError;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class addDup {
    static void main(String[] args) {

        int arr1 [] = {1,3,4,5,2,3} ;
        int arr2 [] = {3,2} ;

//        Set<Integer> set = new HashSet<>() ;
        List<Integer> set = new ArrayList<>() ;

        for (int i=0 ; i< arr1.length ; i++) {
            for (int j=0 ; j<arr2.length ; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]) ;
                }
            }
        }

        System.out.println(set) ;
    }
}
