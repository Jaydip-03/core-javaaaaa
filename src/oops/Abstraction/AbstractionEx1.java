package oops.Abstraction;

abstract  class Parent {
    public abstract void m1() ;

    public static void  m2() {
        System.out.println("static concrete method of Parent class") ;
    }
}

class Child1 extends Parent {

    @Override
    public void m1() {
        System.out.println("m1() implemented by chil1") ;

    }


}

public class AbstractionEx1 {
    static void main(String[] args) {

        new Child1().m1() ;
        Parent p = new Child1() ;
        p.m1() ;
        p.m2() ;
        Parent.m2() ;  // calling by class name
    }
}
