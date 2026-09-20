package Arrays.basicPrograms;

import java.util.Arrays;

public class FunctionArguments {

    public static void update(int [] marks){
        for (int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1 ;
        }

    }

    static void main(String[] args) {

        int marks [] = {88, 78, 97} ;
        System.out.println(Arrays.toString(marks)) ;

        // updtae marks

        update(marks) ;
        System.out.println(Arrays.toString(marks));

        // check indivisual marks
        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i] + " : ") ;
        }



    }
}
