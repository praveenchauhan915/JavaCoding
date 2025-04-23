package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class seperateAlphaAndNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String with number:- ");
        String input = sc.nextLine();
        StringBuilder aplhaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isDigit(ch)){
                numericPart.append(ch);
            } else if (Character.isLetter(ch)) {
                aplhaPart.append(ch);
            }
        }
        System.out.print("Alpha Characters are:- " +aplhaPart);
        System.out.print("\n Numeric Characters are:- " +numericPart);
    }
}
