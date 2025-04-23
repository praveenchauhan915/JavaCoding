package PractiseCodingJava.Number;

import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        for(int i=1;i<= num;i++){
            fact= fact*i;
        }
        System.out.println("Factorial Of Given Number is:- " +fact);
    }
}
