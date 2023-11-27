package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Banana");
		
		System.out.println(fruits);
		Collections.sort(fruits);  
		Collections.reverse(fruits);
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			 System.out.print(it.next());
		}
		
		for(String fruits1: fruits) {
			 System.out.print(fruits1);
		}

	}

}
