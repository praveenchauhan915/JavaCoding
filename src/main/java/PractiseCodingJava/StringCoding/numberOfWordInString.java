package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class numberOfWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:- ");
        String inputString = sc.nextLine();
        int count = 1;
        for(int i=0;i<inputString.length()-1;i++){
            if((inputString.charAt(i) == ' ') && (inputString.charAt(i+1)!= ' ')){
                count++;
            }
        }
        System.out.println("Number of words in a string:- " +count);
    }
}
