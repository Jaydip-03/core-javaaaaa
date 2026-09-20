package Constructor;

class Bag {

    public Bag() {
     super();
    }
   public Bag(String name) {
       System.out.println("Bag barnd is : " + name);
   }

   public Bag(double price) {
       System.out.println("Price of bag is : " + price);
   }
}
public class ParamiterizeExample1 {
    static void main(String[] args) {
        new Bag() ;
        new Bag("SkyBag") ;
        new Bag(12345) ;
    }
}
