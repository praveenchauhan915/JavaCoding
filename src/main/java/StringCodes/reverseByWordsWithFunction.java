package StringCodes;

public class reverseByWordsWithFunction {
    public static void main(String[] args) {
        // Input string
        String input = "This is Java String Coding";
        // Split the string into words
        String[] words = input.split(" ");
        System.out.println(words);

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        System.out.println(result);

        // Reverse each word and append to the result
        for(String word: words){
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        // Trim the trailing space and print the output
        System.out.println(result.toString().trim());

    }
}
