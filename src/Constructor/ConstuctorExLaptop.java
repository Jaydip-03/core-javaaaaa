package Constructor;

class Laptop {
    String name ;
    int ram ;
    double price ;

    Laptop() {
        super() ;
    }

    Laptop(String name, int ram, double price) {
        this.name = name ;
        this.ram = ram ;
        this.price = price ;
    }

    public void displayLaptop() {
        System.out.println("Brand of lapatop is : " + name) ;
        System.out.println("Ram of laptop is : " + ram) ;
        System.out.println("Price of Laptop is : " + price) ;
    }


}

public class ConstuctorExLaptop {
    static void main(String[] args) {
        new Laptop("Macbook", 12, 9000000).displayLaptop() ;

    }
}
