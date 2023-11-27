package String;

public class reverseWordsInString {

	public static void main(String[] args) {
		String str = "My Name is Praveen";
		String s[] = str.split(" ");
		for(int i = s.length-1;i>=0;i--) {
			System.out.print(s[i] + " ");
		}
	}

}
