package interview_Coding;

public class primeNumber {
    public static void main(String[] args) {
        int i, mid=0,flag= 0, num =4;
        mid = num/2;
        if (num==0 ||num ==1){
            System.out.println("Not Prime**");
        }
        else{
            for(i=2;i<=mid;i++){
                if(num%i==0){
                    System.out.println("Not Prime");
                    flag= 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Prime");
            }
        }

    }
}
