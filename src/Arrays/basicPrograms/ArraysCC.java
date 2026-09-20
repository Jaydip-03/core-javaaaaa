package Arrays.basicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCC {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // first way to taking input in array
        int numbers [] = new int [5] ;
        numbers[0] = 1 ;
        numbers[1] = 2 ;
        numbers[2] = 10 ;
        System.out.println(Arrays.toString(numbers));
        // second way of intitialize array
        String name [] = {"Arian", "Tom", "Anotono"} ;
        System.out.println(Arrays.toString(name));


        // third way to initialize value in arrya
        String fruits [] = new String[5] ;
        fruits [0] = sc.nextLine() ;
        fruits [1] = sc.nextLine() ;
        fruits [2] = sc.nextLine() ;
        System.out.println("First fruits is : " + fruits[0]) ;
        System.out.println("Second fruit is : " + fruits[1]) ;
        System.out.println("Third fruits is : " + fruits[2]) ;


        // third way to initialize array
        int marks [] = new int[10] ;
        for (int i=0; i<5; i++) {
            System.out.println("Enter  subject  marks ") ;
            int n = sc.nextInt() ;
            marks[i] = n ;

        }

        System.out.println(Arrays.toString(marks)) ;

        marks [4] = 99 ;
        System.out.println(marks[3]) ;

        int avarage = (marks[0] + marks[1] + marks[2] )/ 3 ;
        System.out.println("Avarage of thre subjecr is  : " + avarage) ;



        // aarya is provide predefine method for calculate length
        int length = marks.length ;
        System.out.println("lenth of Marks Arrya is : " + length);

    }

}
