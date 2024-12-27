package StringCodes;

public class checkCase {
    public static void main(String[] args) {
        String input = "HELLO";
        System.out.println("Is Upper Case:- " + isUpperCase(input));
        System.out.println("Is Lower Case:- " + isLowerCase(input));
    }

    // Method to check if string is in uppercase
    public static boolean isUpperCase(String input){
        return input.equals(input.toUpperCase());
    }
    // Method to check if string is in lowercase
    public static boolean isLowerCase(String input){
        return input.equals(input.toLowerCase());
    }
}
