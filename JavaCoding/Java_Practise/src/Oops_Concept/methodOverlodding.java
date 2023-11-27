package Oops_Concept;

public class methodOverlodding {

	public static void main(String[] args) {
		System.out.println(adder.add(11,11));
		System.out.println(adder.add(11,11,22));

	}

}

class adder{
	static int add(int a, int b) {
		return(a+b);
	}
	
	static int add(int c, int d, int e) {
		return(c+d+e);
	}
}
