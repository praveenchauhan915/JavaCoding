package interview_Coding;

public class rotationOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int num = 3;
        for(int i = 0;i<num;i++){
            int j, first;
            first = a[0];
            for(j=0;j<a.length;j++){
                a[j] = a[j+1];
            }
            a[j]= first;
        }
        System.out.println("After Left Rotation");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }
}
