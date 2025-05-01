package PractiseCodingJava.ArraysCoding;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,10,11,12,13,14,15,16,17,18,19,20};
        Set<Integer> set = new HashSet<>();
        for (int num: array){
            set.add(num);
        }
        System.out.println("Set of Unique Numbers:- " +set);
    }
}
