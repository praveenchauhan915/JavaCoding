package PersistentInterviewJavaCoding;

public class substringEndsWithVowel {
    public static void main(String[] args) {
        String str = "Tgvugeojfhbejsba";
        String vowels= "aeiouAEIOU";
        StringBuilder current = new StringBuilder();
        System.out.println("Substrings ending with vowels:");

        for(int i=0;i<str.length();i++){
            current.append(str.charAt(i));
            // Check if current character is a vowel
            if(vowels.indexOf(str.toString()) != -1){
                System.out.println(current.toString());
                current.setLength(0);
            }
        }
        // Optional: print remaining part if it doesn't end with a vowel
        if(current.length() > 0){
            System.out.println("LeftOver:- " + current.toString());
        }
    }

}
