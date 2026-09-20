package oops.polymorphism.compileTime_poly;

class FindLargest {
    public static int isLargest(int num1 , int num2) {
        return (int) isLargest((double) num1 , num2) ;
    }

    public static double isLargest(double num1, double num2) {
        return num1>num2 ? num1 : num2 ;
    }

    public static int isLargest(int num1, int num2, int num3) {
        return  (num1>num2) ?  (num1 > num3) ?  num1 : num3  :   num2 >  num3  ? num2 : num3 ;
    }
}


public class MethodOverloadingExmple1 {
    static void main(String[] args) {
        double max1 = FindLargest.isLargest(10.0,25) ;
        System.out.println(max1);

        System.out.println(FindLargest.isLargest(40,50,78));

    }
}
