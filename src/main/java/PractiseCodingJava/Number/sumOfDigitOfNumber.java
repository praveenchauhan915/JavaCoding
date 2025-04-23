package PractiseCodingJava.Number;

public class sumOfDigitOfNumber {
    public static void main(String[] args) {
        int number = 12345;
        int sumOfDigit = calculateSumOfDigit(number);
        System.out.println("Sum of digits is " +number+ " is:- " +sumOfDigit);
    }

    public static int calculateSumOfDigit(int number){
        int sum  = 0;
        while (number>0){
            int digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        return sum;
    }
}
