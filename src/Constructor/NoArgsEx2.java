package Constructor;
class Book {
    public Book() {
        System.out.println("Book no argument construtor ");
    }
}

class Pen {
    public Pen() {
        System.out.println("Pen no args constrictorr");
    }
}
public class NoArgsEx2 {
    static void main(String[] args) {
        new Book() ;
        new Pen() ;
    }
}
