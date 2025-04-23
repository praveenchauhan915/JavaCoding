package PractiseCodingJava.Number;

import java.util.Scanner;

public class fibonnacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:- ");
        int number = sc.nextInt();
        int first = 0, second = 1, next;
        System.out.println("Fibonnacci Series is");
        for(int i=0;i<= number;i++){
            System.out.print(first+ " ");
            next = first+second;
            first = second;
            second= next;
        }
    }
}
