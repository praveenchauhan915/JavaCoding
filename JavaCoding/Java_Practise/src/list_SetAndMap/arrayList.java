package list_SetAndMap;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Valvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		
		System.out.println(cars.get(0));
		
		for(int i= 0;i< cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		Collections.sort(cars);
		for(String i: cars) {
			System.out.println(i);
		}

	}

}
