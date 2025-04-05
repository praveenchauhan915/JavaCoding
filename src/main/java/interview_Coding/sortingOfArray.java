package interview_Coding;

import java.util.Arrays;

public class sortingOfArray {
    public static void main(String[] args) {
        int a[] = {6, 8, 2, 4, 3, 1, 5, 7, 6};

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            System.out.print(a[i] + " ");

        }
        System.out.println("*******************");
        Arrays.sort(a);
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }

        }

        a[j] = a[a.length - 1];
        for (int i = 0; i < j + 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
