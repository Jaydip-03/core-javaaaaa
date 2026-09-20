package recursions;

public class IndirectRecusionEx1 {
    static void main(String[] args) {
        System.out.println("Main method starttt ") ;

        m1() ;
    }

    public  static void m1() {
        System.out.println("m1() method ") ;

        m2() ;
    }

    public static void m2() {
        System.out.println("m2()") ;
        m1() ;
    }
}
