package Basic_programs;

import java.util.Scanner;

public class whiteSpacefromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string to be cleaned from white space");
		String inputString = sc.nextLine();
		char[] arrayString = inputString.toCharArray();
		String stringWithoutSpaces = "";
		for (int i = 0; i < arrayString.length; i++) 
        {
            if ( (arrayString[i] != ' ') && (arrayString[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + arrayString[i];
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
         
        sc.close();
	}

}
