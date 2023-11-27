package polymorphism;

public class methodOverloading {

	public static void main(String[] args) {
		methodOverloading mO = new methodOverloading();
		mO.login(53453, "password");
	}
	
	public void login(String un, String pas) {
		System.out.println("Login Successfull using username and password");
	}
	
	public void login(int num, String pas) {
		System.out.println("Login Successfull using phone number and password");
	}
	public void login(int num, String pas, String t) {
		System.out.println("Login Successfull using phone number and password with token");
	}
}
