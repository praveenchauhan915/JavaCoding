package Interiew_Question;

import java.util.Scanner;

public class swap2Number {

	public static void main(String[] args) {
		int x , y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:- ");
		x = sc.nextInt();
		System.out.println("Enter Second Number:- ");
		y = sc.nextInt();
		
		System.out.println("Number before Swapping \n x:- " +x +"\n y:- "+y);
		z=x;
		x=y;
		y=z;
		
		System.out.println("Number after Swapping \n x:- " +x +"\n y:- "+y);
	}

}
