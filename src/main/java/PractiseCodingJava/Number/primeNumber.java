package PractiseCodingJava.Number;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int number = sc.nextInt();
        if(isPrimeNumber(number)){
            System.out.println(number+ " is Prime");
        }else {
            System.out.println(number+ " is not Prime");
        }
    }

    public static boolean isPrimeNumber(int num){
        for(int i=2;i<num;i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
}
