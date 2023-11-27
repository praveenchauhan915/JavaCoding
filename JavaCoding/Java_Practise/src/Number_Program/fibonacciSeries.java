package Number_Program;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		int n1=0 ,n2= 1,n3,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count value");
		count = sc.nextInt();
		for(int i= 2;i<count;i++) {
			n3 = n1+n2;
			System.out.println(" " +n3);
			n1= n2;
			n2= n3;
		}
	}

}
