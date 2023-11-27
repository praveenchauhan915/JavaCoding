package accessModifierDemo;

public class encapsulationDemo {

	private int length;
	private int width;
	private int height;
	
	
	public void setBoxDiemension(int l, int w, int h) {
		if(l>=1 && w>=1 && h>=1) {
			System.out.println("Box Created:- " +l+" "+w+" "+h);
		}
		else {
			System.out.println("Invalid Diemensions");
		}
		
	}
	
	public int setLength(int l) {
		if(l>=1) {
			length = l;
		}
		else {
			System.out.println("Invalid Length");
		}
		return length;
	}
	
	public int setWidth(int w) {
		if(w>=1) {
			width = w;
		}
		else {
			System.out.println("Invalid Width");
		}
		return width;
	}
	
	public int setHeight(int h) {
		if(h>=1) {
			height = h;
		}
		else {
			System.out.println("Invalid Height");
		}
		return height;
	}
	
	public int getLenght() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

}
