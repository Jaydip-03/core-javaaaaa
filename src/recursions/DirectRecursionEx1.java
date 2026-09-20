package recursions;

public class DirectRecursionEx1 {
    static  int a = 1 ;

    static void main(String[] args) {
        System.out.println("Main method");

        printNumber() ;

    }

    public static void printNumber() {
        System.out.println(a++ + " : ") ;

        printNumber() ;
    }
}
