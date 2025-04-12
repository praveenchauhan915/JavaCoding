package PractiseCoding;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");
        set.add("Seven");
        set.add("Eight");
        set.add("Nine");
        set.add("Ten");
        System.out.println(set);
        System.out.println("Size of HashSet:- " +set.size());
        System.out.println("Contains Five:- " +set.contains("Five"));
        System.out.println("**************************************");
        //Using Iterator
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        set.add("Ten");
        System.out.println("HashSet after adding Ten:- " +set);
    }
}
