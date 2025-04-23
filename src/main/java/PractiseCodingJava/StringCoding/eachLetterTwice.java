package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class eachLetterTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:- ");
        String input = sc.nextLine();
        StringBuilder doubleLetter = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            doubleLetter.append(ch).append(ch);
        }
        System.out.print("Double Character String is:- " +doubleLetter);
    }
}
