package PractiseCodingJava.ArraysCoding;

import java.util.ArrayList;
import java.util.List;

public class firstAndLastElementInArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Cherry");
        arrayList.add("Banana");
        arrayList.add("Date");
        if (!arrayList.isEmpty()){
            System.out.println("First Element is:- " + arrayList.get(0));
            System.out.println("Last Element is:- " + arrayList.get(arrayList.size()-1));
        }
    }
}
