package PractiseCodingJava.Number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int arm = 0,a,d, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        num = sc.nextInt();
        d = num;
        while (num>0){
            a = num%10;
            num = num/10;
            arm = arm +a*a*a;
        }
        if(arm ==d){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not Armstrong Number");
        }
    }
}
