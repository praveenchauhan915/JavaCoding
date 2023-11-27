package Basic_programs;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
//		String s;  
//		Scanner sc=new Scanner(System.in);                    //reading string from user  
//		System.out.print("Enter a String: ");  
//		s=sc.nextLine();  
//		System.out.print("After reverse string is: ");  
//		int i=s.length();                   //determining the length of the string   
//		while(i>0)  
//		{  
//		System.out.print(s.charAt(i-1));                 //printing the character at index i-1  
//		i--;  	
//	}
		
		
		String str2 = "MyJava";
		char[] str3 = str2.toCharArray();
		for(int i1 = str3.length-1;i1>=0;i1--) {
			System.out.print(str3[i1]);
		}
	}
}
