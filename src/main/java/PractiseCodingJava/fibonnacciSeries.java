package PractiseCodingJava;

public class fibonnacciSeries {
    public static void main(String[] args) {
        int n1 = 0,n2 = 1,n3 = 0;
        System.out.println("Fibonacci Series is:- ");
        for(int i=1;i<=10;i++){
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
