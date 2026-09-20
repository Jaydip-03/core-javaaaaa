package Constructor;


class Animal {
    public Animal() {
        super();
        System.out.println("Animal no args constructor ");
    }
}

class Cat extends  Animal {
    public Cat() {
        super();
        System.out.println("Cat no args constuctor");
    }
}

public class NoargsEx1 {
    static void main(String[] args) {
        Cat cat = new Cat() ;
    }
}
