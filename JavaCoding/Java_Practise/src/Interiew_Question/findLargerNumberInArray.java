package Interiew_Question;

public class findLargerNumberInArray {
	static int arr[] = {21,98,13,9,34};


	public static void main(String[] args) {
		int maxNumber = findlargertNumber();
		System.out.println("Maximum number in the array: "+ maxNumber);
	}

	private static int findlargertNumber() {
		int max = arr[0];
		for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i]; 
       }
		return max;
	}

}
