package PractiseCodingJava.StringCoding;

public class appendCharacter {
    public static void main(String[] args) {
        String input = "aaabbbbcccBB";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)== input.charAt(i-1)){
                count++;
            }else{
                result.append(input.charAt(i-1)).append(count);
                count= 1;
            }
        }
        System.out.println(result.append(input.charAt(input.length()-1)).append(count));
    }
}
