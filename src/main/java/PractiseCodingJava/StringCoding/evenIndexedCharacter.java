package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class evenIndexedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:- ");
        String input = sc.nextLine();
        System.out.print("Even Indexed Charater in "+input+" are:- ");
        for (int i=0;i<input.length();i++){
            if(i%2==0){
                System.out.print(input.charAt(i)+ " ");
            }
        }
    }
}
