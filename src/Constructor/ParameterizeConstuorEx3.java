package Constructor;

class Persone {
    public Persone() {
        super();
    }

    public Persone(String name) {
        System.out.println("Name of person is : " +name);
    }
}

class Inforamtion extends  Persone {
    public Inforamtion() {
    }

    public Inforamtion(String data) {
        super("Gwen");
        System.out.println(data);
    }
}


public class ParameterizeConstuorEx3 {
    static void main(String[] args) {
        new Inforamtion("Develoer") ;

    }
}
