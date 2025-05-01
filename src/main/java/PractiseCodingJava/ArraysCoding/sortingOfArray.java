package PractiseCodingJava.ArraysCoding;

public class sortingOfArray {
    public static void main(String[] args) {
        int[] array= {5,2,9,1,6};
        int arrayLength = array.length;
        for (int i=0;i<arrayLength;i++){
            int minIndex = i;
            for (int j=i+1;j<arrayLength;j++){
                if (array[j]< array[minIndex]){
                    minIndex =j;
                }
            }
            int temp= array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println("Sorted Array:- " );
        for (int num: array){
            System.out.print(num+" ");
        }
    }
}
