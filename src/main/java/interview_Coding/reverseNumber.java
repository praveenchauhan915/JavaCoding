package interview_Coding;

public class reverseNumber {
    public static void main(String[] args) {
        int rem, rev=0, temp;
        int num = 453;
        while (num>0){
            rem = num%10;
            rev = (rev*10) +rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
