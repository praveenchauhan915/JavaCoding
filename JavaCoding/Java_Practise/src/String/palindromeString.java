package String;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		String orignalStr, reverseStr ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		orignalStr = sc.nextLine();
	    int length = orignalStr.length();
	    for(int i =length -1;i>=0;i--) {
	    	reverseStr = reverseStr + orignalStr.charAt(i);
	    }
	    if (orignalStr.equals(reverseStr))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");
	}

}
