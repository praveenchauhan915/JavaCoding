package PractiseCodingJava.StringCoding;

import java.util.Scanner;

public class printUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:-");
        String input = sc.nextLine();
        System.out.println("Unique Character in " + input+ ":- ");
        boolean[] unique = new boolean[128];
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(!unique[ch]){
                unique[ch] = true;
                System.out.print(ch+ " ");
            }
        }
    }
}
