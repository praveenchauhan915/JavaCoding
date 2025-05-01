package PractiseCodingJava.Number;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int num , rev = 0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        num = sc.nextInt();
//        a = num;
        while (num>0){
            rem= num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("Reverse:- " +rev);
    }
}
