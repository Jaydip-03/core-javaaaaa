package Arrays.basicPrograms;

import java.util.Arrays;

public class initializeUniquCharecters {
    static void main(String[] args) {
        char arr [] = new char[26] ;

        int i=0 ;
        while (i<arr.length) {

             char ascii = (char) (Math.random() * 100) ;
             if (ascii >= 65 && ascii <= 90) {
                 if (! check(arr, ascii)) {
                     arr[i++] = ascii ;
                 }
             }

        }


        System.out.println(Arrays.toString(arr));
    }

    public  static boolean check(char arr [], char ch) {
        for (char ele : arr) {
            if (ch == ele)
                return  true ;
        }
        return  false ;
    }
}
