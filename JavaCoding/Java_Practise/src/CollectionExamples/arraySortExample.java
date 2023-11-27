package CollectionExamples;

public class arraySortExample {

	public static void main(String[] args) {
		int[] arr = new int[] {45, 12, 78, 34, 89, 21};
		System.out.println("Array after Sorting:- ");
		
		//Sorting logic
		for(int i =0 ; i< arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
