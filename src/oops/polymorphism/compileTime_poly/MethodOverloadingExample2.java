package oops.polymorphism.compileTime_poly;


class AreaCalculator {
    public static double calArea(double radius) {
        return 3.13 * radius * radius ;
    }

    public static double calArea(double length, double bredth) {
        return length * bredth ;
    }

    public static double calArea(int side) {
        return side * side ;
    }
}

public class MethodOverloadingExample2 {
    static void main(String[] args) {

        double areaOfCircle = AreaCalculator.calArea(20.0) ;
        System.out.println("Area od circle is : " + areaOfCircle) ;

        double arerRectagle = AreaCalculator.calArea(10,30) ;
        System.out.println("Area of Reactangel is : " + arerRectagle) ;

        int areaSqure = (int) AreaCalculator.calArea( 5) ;
        System.out.println("Area of squre is : " + areaSqure);


    }
}
