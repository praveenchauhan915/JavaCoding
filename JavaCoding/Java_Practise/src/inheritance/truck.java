package inheritance;

public class truck extends vehicleCommon{

	public static void main(String[] args) {
		truck tr = new truck();
		tr.start();
		tr.stop();
	}
	
	
	public void loadCapacity() {
		System.out.println("Load Capacity");
	}
	
	

}
