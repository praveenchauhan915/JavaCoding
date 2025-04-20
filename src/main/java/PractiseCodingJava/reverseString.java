package PractiseCodingJava;

public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String:- " +rev);
        String reverse = reverseString(str);
        System.out.println("Reversed String using recursion:- " +reverse);
    }

    //using recursion
    public static String reverseString(String str){
        if(str.isEmpty()){
            return  str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
