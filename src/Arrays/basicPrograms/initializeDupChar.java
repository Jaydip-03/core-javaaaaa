package Arrays.basicPrograms;

import java.util.Arrays;

public class initializeDupChar {
    static void main(String[] args) {

        char arr [] = new char[26] ;
        /*for (int i=0, j=0; i<arr.length ; i++) {
            char  ascii = (char) (Math.random() * 100) ;
            if (ascii >= 65 && ascii <= 90) {
                arr[j] = ascii ;
                j++;
                continue ;
            }
            i--;

        }
        System.out.println(Arrays.toString(arr));*/


        for (int i=0, j=0 ; i<arr.length ; i++) {
            int ascii = (int)(Math.random() * 100 ) ;
            if (ascii >= 65 && ascii <= 90) {
                arr[j++] = (char) ascii ;
                continue ;
            }
            i-- ;
        }
        System.out.println(Arrays.toString(arr)) ;
    }
}
