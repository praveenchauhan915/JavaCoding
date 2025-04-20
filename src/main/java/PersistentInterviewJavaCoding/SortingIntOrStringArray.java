package PersistentInterviewJavaCoding;

import java.util.Arrays;

public class SortingIntOrStringArray {
    public static void main(String[] args) {
        int[] number = {5,9,6,7,3};
        String[] names = {"Zoe", "Alice", "John", "Bob"};
        Arrays.sort(number);
        for(int num :number){
            System.out.println(num + " ");
        }
        Arrays.sort(names);
        for(String name: names){
            System.out.println(name + " ");
        }
    }


}
