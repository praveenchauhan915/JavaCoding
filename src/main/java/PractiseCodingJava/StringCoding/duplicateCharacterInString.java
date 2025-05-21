package PractiseCodingJava.StringCoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class duplicateCharacterInString {
    public static void main(String[] args) {
        String inputString = "Learn Java Programming";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters in :- " + inputString);
        for (Character ch : charsInString) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " :" + charCountMap.get(ch));
            }
        }
    }
}
