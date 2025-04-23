package PractiseCodingJava.Number;

import java.util.Scanner;

public class OddEvenChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println(number+" is EVEN");
        }else {
            System.out.println(number+" is ODD");
        }
    }
}
