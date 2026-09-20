package Constructor;

class Demo1 {
    int age = 10;
    public Demo1() {
        super();
    }
}

class Demo2 extends Demo1 {
    int age = 20 ;
    void display() {
        System.out.println(age) ;
        System.out.println(super.age) ;
    }
}



public class SuperKeywordExampl1 {
    static void main(String[] args) {
        new Demo2().display();
    }
}
