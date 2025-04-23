package PractiseCodingJava.StringCoding;

import java.util.Locale;

public class vowelsConsonantCounts {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.toLowerCase();
        int vowel=0, consonant=0;
        for(char c : str.toCharArray()){
            if(c>='a' && c<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowel++;
                }else {
                    consonant++;
                }
            }
        }
        System.out.println("Vowels Count:- " +vowel);
        System.out.println("Consonant Count:- "+ consonant);
    }
}
