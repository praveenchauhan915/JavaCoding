package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:- ");
        String input = sc.nextLine();
        char ch;
        String nstr = "";
        for(int i=0;i<input.length();i++){
            ch = input.charAt(i);
            nstr =  ch + nstr;
        }
        System.out.println("Reversed String is:- " + nstr);
    }
}
