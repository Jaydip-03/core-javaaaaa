package collection.collectionProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Example1 {
    static void main(String[] args) {

        Collection<Integer> list1 = new ArrayList<>() ;
        System.out.println(list1.size());
        list1.add(10) ;
        list1.add(20) ;
        list1.add(10) ;
        System.out.println(list1);
        System.out.println(list1.size());

        Collection<String> set = new HashSet<>() ;
        System.out.println(set.size());
        set.add("apple") ;
        set.add("banana") ;
        set.add("apple") ;  // not insert duplicate
        System.out.println(set);
        System.out.println(set.size());

    }
}
