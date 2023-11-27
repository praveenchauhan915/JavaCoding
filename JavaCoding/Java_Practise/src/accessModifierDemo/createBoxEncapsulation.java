package accessModifierDemo;

public class createBoxEncapsulation {

	public static void main(String[] args) {
		encapsulationDemo eD = new encapsulationDemo();
		
//		int h = eD.height = 10;
//		int l = eD.length = 20;
//		int b = eD.width = 30;
	    int l = eD.setLength(20);
	    int w = eD.setWidth(10);
	    int h = eD.setHeight(30);
		eD.setBoxDiemension(l,w, h);
		System.out.println("Lenght is:- " +eD.getLenght());
		System.out.println("Width is:- " +eD.getWidth());
		System.out.println("Height is:- " +eD.getHeight());

	}

}
