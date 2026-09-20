package Arrays.basicPrograms;

public class SmalestElementInArray {
    static void main(String[] args) {

        int arr [] = {2,4,6,1,7,8,9,3,5} ;

        int smallest = Integer.MAX_VALUE ;
        for (int ele : arr) {
            if (ele < smallest) {
                smallest = ele ;
            }
        }

        System.out.println("Smallest element of arrya is :  " + smallest) ;

        System.out.println("Smallest element in array is : " + findSmallestEle(arr)) ;
    }

    public static int findSmallestEle(int [] arr) {
        int smallest = Integer.MAX_VALUE ;

        for (int i=0 ; i<arr.length ; i++) {
            if (smallest > arr[i])
                smallest = arr[i] ;
        }

        return smallest ;
    }
}
