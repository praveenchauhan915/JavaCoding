package Number_Program;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		int m= 0,flag= 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number to check primer number:- ");
	    int n = sc.nextInt();
	    m= n/2;
	    if(n==0||n==1) {
	    	System.out.println(n+ "is not a prime number");
	    }
	    else {
	    	for(int i =2;i<=m;i++) {
	    		if(n%i==0) {
	    			System.out.println(n+ "is not a prime number");
	    			flag= 1;
	    			break;
	    		} 		
	    	}
	    	if(flag==0) {
	    		System.out.println(n+ " is a prime number");
	    	}
	    }
	}

}
