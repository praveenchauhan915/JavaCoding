package PractiseCodingJava.ArraysCoding;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7};
        int n = array.length +1;
        int totalSum = (n*(n+1))/2;
        int arraySum = 0;
        for (int num: array){
            arraySum = arraySum + num;
        }
        System.out.println("Missing Number is:- " +(totalSum-arraySum));
    }
}
