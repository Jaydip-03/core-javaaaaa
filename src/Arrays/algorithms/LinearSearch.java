package Arrays.algorithms;

import java.util.Arrays;

public class LinearSearch {
    static void main(String[] args) {

        int [] arr = {2,3,5,6,8,10,7,9} ;
        System.out.println(Arrays.toString(arr)) ;
        int key = 10 ;

        // linear search simple way
//        for (int i=0 ; i<arr.length ; i++) {
//            if (arr[i] == key)
//                System.out.println(i + " : ");
//        }

        // linear search using function it is correct way

        int index = linearSearchFunction(arr, key) ;
        if(index == -1)
           System.out.println("key is not present " ) ;
        else
            System.out.println("Key is at index : " + index) ;




        String fruits [] = {"Apple", "Mango", "Watermelon", "Orange", "lichy"} ;
        String frrt = "Orange" ;
        if (findFruitNo(fruits, frrt) == -1)
            System.out.println("Fruit is not present ") ;
        else
            System.out.println("Fruit is present at  : " + findFruitNo(fruits, frrt)) ;
    }

    public  static int linearSearchFunction(int [] arr, int key) {

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key)
                return i ;
        }

        return -1 ;
    }



    public static int findFruitNo(String [] fruits, String frt) {
        for (int i=0; i<fruits.length; i++) {
            if (fruits[i].equals(frt))
                return i ;
        }

        return -1 ;
    }
}
