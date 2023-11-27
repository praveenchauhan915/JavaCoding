package CollectionExamples;

public class duplicateElement {

	public static void main(String[] args) {
		String [] arr = {"abc", "java", "javahungry", "java", "javahungry"};
		for(int i = 0; i< arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i].equals(arr[j]) && i!= j) {
					System.out.println("Duplicate in Array is : "+ arr[j]);
				}
			}
		}

	}

}
