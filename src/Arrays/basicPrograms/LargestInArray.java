package Arrays.basicPrograms;

public class LargestInArray {
    static void main(String[] args) {

        int arr [] = {1,3,5,6,2,4,7,9,4} ;
        int max = 0 ;
        for (int i=0 ; i<arr.length ; i++) {
            if (max < arr[i])
                max = arr[i] ;
        }

        System.out.println("Maximum element in array is : " + max) ;

        System.out.println("Largest element on array in is : "+ findLargest(arr)) ;

    }

    public static int findLargest(int [] num) {
        int largest = Integer.MIN_VALUE ;

        for (int i=0 ; i<num.length ; i++) {
            if (largest < num [i])
                largest = num[i] ;
        }

        return  largest ;
    }
}
