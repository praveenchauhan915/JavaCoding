package PractiseCodingJava.StringCoding;

public class reverseStringByWord {
    public static void main(String[] args) {
        String inputString = "Java is good programming language";
        String reverseString ="";
        String[] words= inputString.split(" ");
        for(int i=0;i< words.length;i++){
            String word = words[i];
            String nstr = "";
            char ch;
            for(int j=0;j<word.length();j++){
                ch= word.charAt(j);
                nstr = ch + nstr;
            }
            reverseString = reverseString + nstr + " ";
        }
        System.out.println("Input String is:- "+ inputString);
        System.out.println("Reversed String by Words:- " +reverseString);
    }
}
