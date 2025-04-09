package interview_Coding;

public class swapStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String str1 = "Hello";
        String str2 = "World";
        String temp = a;
        //Using temp variable
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("++++++++Without Using Temp Variable++++++++++++++");
        System.out.println("Before Swapping");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        str1 = str1+str2;
        str2= str1.substring(0,str1.length()-str2.length());
        str1= str1.substring(str2.length());
        System.out.println("After Swapping");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
