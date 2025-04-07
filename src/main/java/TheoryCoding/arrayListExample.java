package TheoryCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");
        list.add("Grapes");
        System.out.println(list);

        // Traversing using Iterator
        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //Using for-each loop
        for(String fruit:list){
            System.out.print(" "+fruit);
        }

        // Accessing the element
        System.out.println("Returning element:- " + list.get(4)); // it will return 2nd item because index starts from 0
        //Changing the element
        list.set(4,"Dates");
        //Traversing list
        for (String fruits:list){
            System.out.print(" " +fruits);
        }

        //Sorting
        Collections.sort(list);
        for(String fruit1:list){
            System.out.print(" "+fruit1);
        }
    }
}
