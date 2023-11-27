package Basic_programs;

import java.util.Scanner;

public class checkEvenNumber {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number:-");
		int number = sc.nextInt();
		if(number%2 == 0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
		}

}
