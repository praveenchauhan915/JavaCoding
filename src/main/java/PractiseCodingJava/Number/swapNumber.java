package PractiseCodingJava.Number;

import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int first = sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int second = sc.nextInt();
        System.out.println("Before Swapping First Number:- "+first + "\n Second Number:-  "+ second);
        first = first+ second;
        second = first-second;
        first = first - second;

        System.out.println("After Swapping First Number:- "+first + "\n Second Number:-  "+ second);

    }
}
