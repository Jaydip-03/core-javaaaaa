package Constructor;


class Car {
    public Car() {

    }

}

class Bike extends  Car {
    Bike(int age) {
        System.out.println("Bile class no args constructor" );
    }
}

public class DefaltConstructorEx1 {

    static void main(String[] args) {

        new Bike(10) ;
    }
}
