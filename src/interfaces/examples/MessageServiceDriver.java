package interfaces.examples;

public class MessageServiceDriver {

    MessageService messageService ;

    public  MessageServiceDriver() {
        this.messageService = new EmailService() ;
    }

//    public MessageServiceDriver(MessageService messageService) {
//        this.messageService = messageService ;
//    }

    void printMessage() {
        System.out.println(messageService.getMessage()) ;
    }


    static void main(String[] args) {
//        String str = new EmailService().getMessage() ;
//        System.out.println(str) ;

        new MessageServiceDriver().printMessage() ;



//       MessageServiceDriver d = new MessageServiceDriver(new EmailService() ) ;
//       d.printMessage() ;
    }
}
