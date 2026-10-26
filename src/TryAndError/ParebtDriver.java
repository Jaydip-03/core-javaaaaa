package TryAndError;

class child {
    public static void print(){
        System.out.println("Hello from chid") ;
    }

    public void greet() {
        System.out.println("Helloooo frommm childd") ;
    }
}

class GrandChild extends child {
    public static void print() {
        System.out.println("Hello from grandChild");
    }

    public void greet() {
        System.out.println("Hello from grenddddd") ;
    }
}

public class ParebtDriver {
    static void main(String[] args) {

        new GrandChild().greet() ;


    }
}
