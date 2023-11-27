package Number_Program;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int num = sc.nextInt();
		for(int i = 1; i<= num;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial Number:- " +fact);
	}

}
