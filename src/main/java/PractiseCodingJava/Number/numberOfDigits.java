package PractiseCodingJava.Number;

import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int number = sc.nextInt();
        int a = 1;
        while(number>1){
            number = number/10;
            a++;
        }
        System.out.println("Total Number of digits are:- " + a);
    }
}
