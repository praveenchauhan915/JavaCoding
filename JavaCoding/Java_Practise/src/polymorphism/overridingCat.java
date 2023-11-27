package polymorphism;

public class overridingCat extends methodOverridingExample {

	public static void main(String[] args) {
		overridingCat oC = new overridingCat();
		oC.makeNoiseMethod();
	}
	
	public void makeNoiseMethod() {
		System.out.println("Cat Meows");
;	}

}
