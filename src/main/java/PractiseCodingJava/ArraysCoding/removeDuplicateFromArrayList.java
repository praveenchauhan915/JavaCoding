package PractiseCodingJava.ArraysCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(5);
        for (int num: arrayList){
            System.out.println(num+" ");
        }
        Set<Integer> set = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(set);
        System.out.println("After removing duplicate:- ");
        for (int num: arrayList){
            System.out.print(num+" ");
        }
    }
}
