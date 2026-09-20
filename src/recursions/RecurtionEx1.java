package recursions;

public class RecurtionEx1 {
    static void main(String[] args) {

        m1() ;

    }

    public static  void m1() {
        System.out.println("Hello from m1") ;

        // recution call
        m1() ;
    }
}
