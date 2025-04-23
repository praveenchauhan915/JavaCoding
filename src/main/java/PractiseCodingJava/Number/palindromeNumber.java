package PractiseCodingJava.Number;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int number = sc.nextInt();
        if(isPalindrome(number)){
            System.out.println(number+ " is Palindrome.");
        }else {
            System.out.println(number+ " is not Palindrome.");
        }
    }

    public static boolean isPalindrome(int num){
        int originalNumber = num;
        int reverseNumber = 0;
        while (num!=0){
            int digit = num%10;
            reverseNumber = reverseNumber*10 +digit;
            num =  num/10;
        }
        return  originalNumber == reverseNumber;
    }
}
