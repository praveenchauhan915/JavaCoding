package Basic_programs;

public class stringLiteralsVsObjectExample {

	public static void main(String[] args) {
		String str1 = "RCV";
		String str2 = new String("RCV");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
