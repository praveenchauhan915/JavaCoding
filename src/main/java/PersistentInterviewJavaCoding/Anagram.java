package PersistentInterviewJavaCoding;
//Write are program to check if two string are anagram or not

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!= str2.length()){
            System.out.println("Not Anagram");
        }
        else{
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if(Arrays.equals(charArray1,charArray2)==true){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }

    }
}
