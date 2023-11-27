package Basic_programs;

public class methodDemo {

	public static void main(String[] args) {
		methodDemo mD = new methodDemo();
		mD.doLogout();
	}
	
	public void doLogin() {
		System.out.println("Login Code Started");
	}
	
	public void doLogout() {
		doLogin();
		System.out.println("Logout Code Started");
	}

}
