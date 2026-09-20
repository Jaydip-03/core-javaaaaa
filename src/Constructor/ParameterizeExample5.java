package Constructor;

class Parent {
    public Parent(int x) {
        System.out.println("Parent class constrtor with value: " + x );
    }
}

class Child extends  Parent {
    public  Child() {
        super(10);
        System.out.println("Child no args constructor");
    }
}

public class ParameterizeExample5 {
    static void main(String[] args) {
        new Child() ;
    }
}
