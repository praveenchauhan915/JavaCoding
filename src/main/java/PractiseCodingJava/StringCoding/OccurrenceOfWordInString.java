package PractiseCodingJava.StringCoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurrenceOfWordInString {
    public static void main(String[] args) {
        String inputString = "Java Automation Test Automation";
        Map<String, Integer> charCountMap = new HashMap<>();
        for(String s: inputString.split(" ")){
            if(charCountMap.containsKey(s)){
                charCountMap.put(s,charCountMap.get(s)+1);
            }else {
                charCountMap.put(s,1);
            }
        }
        System.out.println("Count of Words in given String is :- " +charCountMap);
    }
}
