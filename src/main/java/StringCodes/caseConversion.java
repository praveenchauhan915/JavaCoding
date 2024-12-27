package StringCodes;

import java.util.Locale;

public class caseConversion {
    public static void main(String[] args) {
        String input = "Hello World";

        //Convert to Lower Case
        String lowerCase = input.toLowerCase();
        System.out.println("Lower Case:- " + lowerCase);

        String upperCase = input.toUpperCase();
        System.out.println("Upper Case:- " +upperCase);
    }
}
