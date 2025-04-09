package interview_Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseString {
    public static void main(String[] args) {
        //Using String builder
        String str = "Praveen";
        String builder = new StringBuilder(str).reverse().toString();
        System.out.println("Using String Builder:- " +builder);

        //Using for loop
        String revStr = "";
        for (int i=str.length()-1;i>=0;i--){
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Using For Loop:- " +revStr);

        //toCharArray
        char[] ch = str.toCharArray();
        String revStr1 = "";
        for (int i=ch.length-1;i>=0;i--){
            revStr1 = revStr1 + ch[i];
        }
        System.out.println("Using toCharArray:- " +revStr1);

        //Using Collection.reverse()
        List<Character> list = Arrays.asList(str.chars().mapToObj(c -> (char) c).toArray(Character[]::new));
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            sb.append(c);
        }
        String reverseStr2 = sb.toString();
        System.out.println("Using Collections reverse method:- " +reverseStr2);
    }
}
