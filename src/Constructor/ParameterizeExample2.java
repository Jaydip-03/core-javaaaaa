package Constructor;

import java.util.Map;

class Application {
    public Application() {
     super();
    }

    public Application(String appName) {
        System.out.println("Application name is : " + appName);
    }

    public Application(int capacity, String stack) {
        this("Springboot") ;
        System.out.println("Applicatiin size is : " + capacity + " \n the language is used for builsd id :  " + stack  );
    }

    public Application(int lauchDate) {
        this(20, "JAVA") ;
        System.out.println("Application ll launch on : " + lauchDate);
    }


}
public class ParameterizeExample2 {
    static void main(String[] args) {
        new Application(11222025) ;
    }
}
