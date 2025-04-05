package interview_Coding;

public class minMaxInArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 2, 4, 5, 1, 8, 7};
        int max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("Max number is:- " + max);
        System.out.println("Min number is:- " + min);

    }
}
