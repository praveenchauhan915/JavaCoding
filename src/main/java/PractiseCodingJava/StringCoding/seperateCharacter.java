package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class seperateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:- ");
        String input = sc.nextLine();
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isLowerCase(ch)){
                lowerCase.append(ch);
            }else {
                upperCase.append(ch);
            }
        }
        System.out.print("Lower Case characters are:- " + lowerCase);
        System.out.print("\nUpper Case characters are:- "+ upperCase);
    }
}
