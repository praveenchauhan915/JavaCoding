package StringCodes;

public class ReverseByWordsWithoutStringFunctions {
    public static void main(String[] args) {
        // Input string
        String input = "This is Java Coding";
        char[] word = input.toCharArray();

        // Array to store the result
        char[] result = new char[input.length()];

        int j =0;
        int start = 0;

        for(int i = 0;i<=input.length();i++){
            // When we reach a space or the end of the array
            if(i==input.length() || word[i]== ' '){
                // Reverse the word
                for(int k= i-1;k>=start;k--){
                    result[j++] = word[k];
                }
                // Add a space after the word, if not the last word
                if(i!= word.length){
                    result[j++] = ' ';
                }
                // Move the start index to the next word
                start = i+1;
            }
        }
        //Print the Result
        System.out.println(new String(result));
    }
}
