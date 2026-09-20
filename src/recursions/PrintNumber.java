package recursions;

public class PrintNumber {
    static int num = 1 ;

    static void main(String[] args) {
        System.out.println("Mian method ");

        printNumber() ;

        printDigit(1) ;
    }

    public static void printNumber() {
        System.out.println(num + " : ") ;
        num++ ;
        if (num > 10)
            return ;

        printNumber() ;
    }


    public static void printDigit(int n) {
        System.out.println(n + " : ");
        if (n > 20)
            return ;

        printDigit(++n) ;

    }
}
