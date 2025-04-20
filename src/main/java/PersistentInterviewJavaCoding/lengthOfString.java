package PersistentInterviewJavaCoding;

public class lengthOfString {
    public static void main(String[] args) {
        String input = "Hello World";
        int count = 0;
        for (char ch : input.toCharArray()){
            count++;
    }
    System.out.println("Length of String without length function:- " +count);
}

}
