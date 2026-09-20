package Constructor;

class Test {
    public Test() {
        super();
    }
    void display() {
        System.out.println("Hello from parent display method");
    }
}

class ChildTest extends  Test {
    @Override
    void display() {
        System.out.println("Child display method");
        super.display();
    }
}


public class SuperKeywordEx2 {
    static void main() {
        ChildTest t = new ChildTest() ;
        t.display() ;
    }
}
