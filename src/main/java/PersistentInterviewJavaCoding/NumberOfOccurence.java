package PersistentInterviewJavaCoding;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurence {
    public static void main(String[] args) {
        String str = "Praveen";
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) +1);
            }
            else
                map.put(c,1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ":- " + entry.getValue());
        }
    }
}
