package StringCodes;

public class titleCaseConversion {
    public static void main(String[] args) {
        String sentence = "hello World from Java";
        String titleCase = toTitleCase(sentence);
        System.out.println("Title Case:- " + titleCase);
    }

    public static String toTitleCase(String input){
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words){
            if (word.length()>0){
                result.append(word.substring(0,1).toUpperCase()) //First Letter to upper Case
                        .append(word.substring(1).toLowerCase()) //Rest of the letters to Lower Case
                        .append(" ");

            }
        }
        return result.toString().trim();
    }
}
