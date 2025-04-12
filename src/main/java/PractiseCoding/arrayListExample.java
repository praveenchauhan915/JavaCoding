package PractiseCoding;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Coding");
        System.out.println("ArrayList:- " +list);
        System.out.println("Size of ArrayList:- " +list.size());
        System.out.println("Index of Java:- " +list.indexOf("Java"));
        System.out.println("Contains Java:- " +list.contains("Java"));
        System.out.println("Remove Java:- " +list.remove("Java"));
        System.out.println("ArrayList after removing Java:- " +list);
        System.out.println("*************************************");
        //Using iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("*************************************");
        //Using for Each Loop
        for(String fruit:list){
            System.out.print("Fruits are:- " +fruit);
        }
    }
}
