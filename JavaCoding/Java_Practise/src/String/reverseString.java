package String;

public class reverseString {

	public static void main(String[] args) {
		String str = "Reverse String";
		String rev_str= "";
		for(int i= str.length()-1;i>=0;i--) {
			rev_str= rev_str+str.charAt(i);
		}
		 System.out.println("Reverse of given string: " + rev_str);    
	}

}
