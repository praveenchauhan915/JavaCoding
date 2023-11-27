package Interiew_Question;

import java.util.Arrays;

public class stringToArray {

	public static void main(String[] args) {
		String str = "Converting string to string array using split() method";  
		//declaring an empty string array  
		String[] strArray = null;  
		//converting using String.split() method with whitespace as a delimiter  
		strArray = str.split(" ");  
		//printing the converted string array  
		for (int i = 0; i< strArray.length; i++){  
		System.out.println(strArray[i]);  
		}
		
		for(int j = strArray.length - 1;j>=0;j--) {
			System.out.println(strArray[j]);
		}
		
		
		
        }

	}


