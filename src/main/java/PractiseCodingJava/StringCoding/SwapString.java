package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String:- ");
        String first = sc.nextLine();
        System.out.println("Enter Second String:- ");
        String second = sc.nextLine();
        System.out.println("Before Swapping \n First String:- " + first+" \nSecond String:- " +second);
        first = first + second;
        second = first.substring(0,first.length()- second.length());
        first = first.substring(second.length());
        System.out.print("After Swapping\n First string :- " + first + "\nSecond String:- " + second);
    }


}
