package PractiseCoding;

import javax.net.ssl.SSLEngineResult;
import java.util.Arrays;
import java.util.HashSet;

public class Practise {
    public static void main(String[] args) {
        String str = "PR12AArfVEEN";
        int sum = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            if(!set.add(c)){
                System.out.println(c);
            }
        }
        char[] ch= str.toCharArray();
        for(char c : ch){
            if(Character.isDigit(c)){
                sum = sum + Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}
