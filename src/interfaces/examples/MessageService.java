package interfaces.examples;

public interface MessageService {
    String getMessage() ;
}

 class EmailService implements MessageService {

    @Override
    public String getMessage() {
        return "message recived throu email : Hiii Hello " ;
    }
}
