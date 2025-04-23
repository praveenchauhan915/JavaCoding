package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class removeSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:- ");
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!= ' '){
                result.append(input.charAt(i));
            }
        }
        System.out.print("String without space:- " +result.toString());
    }
}
