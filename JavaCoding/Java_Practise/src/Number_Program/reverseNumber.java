package Number_Program;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to reverse:- ");
		int num = sc.nextInt();
		while(num!=0) {
			int reminder = num%10;
			reverse = reverse*10 + reminder;
			num = num/10;
		}
		System.out.println("The reverse of the given number is: " + reverse);  
	}
	
	
	  

}
