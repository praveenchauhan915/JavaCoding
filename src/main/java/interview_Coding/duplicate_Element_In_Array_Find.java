package interview_Coding;

import java.util.Arrays;
import java.util.HashSet;

public class duplicate_Element_In_Array_Find {
    public static void main(String[] args) {
        int [] a = {3,5,6,6,9,3};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                        System.out.print(a[i]+ " ");
                }
            }
        }
        System.out.println();
////Using  Hash Set
//        int [] a1 = {10,20,30,30,40,50,60,50};
//        HashSet<Integer> hs = new HashSet<>();
//        for(int i= 0; i<a1.length;i++){
//            hs.add(a1[i]);
//        }
//        for (int num :hs){
//            System.out.print(num+ " ");
//        }
    }
}
