package String;

public class stringConCat {

	public static void main(String[] args) {
		String str1 = "Praveen";
		String str2 = "Chauhan";
		
		System.out.println("First Name and Last Name:- " +str1+ str2);
		
		//Using concat method
		String str3 = str1.concat(str2);
		System.out.println("String 3 is:- " +str3);
		
		//Using + operator
		String str4 = str1+ str2;
		System.out.println("String 4 is:-" +str4);

	}

}
