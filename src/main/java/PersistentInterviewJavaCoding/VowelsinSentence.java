package PersistentInterviewJavaCoding;

import java.util.*;

public class VowelsinSentence {
    public static void main(String[] args) {
        String sentence = "Java programming is fun and educational";
        String[] words = sentence.split("\\s+");
        String vowels = "aeiouAEIOU";
        // Create a list to store words with their vowel counts
        List<String> wordsWithVowels = new ArrayList<>();
        // Map to store vowel count per word
        Map<String, Integer> vowelCountMap = new HashMap<>();
        // Count vowels in each word
        for (String word : words) {
            int count = 0;
            for (char ch : word.toCharArray()) {
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
            if (count > 0) {
                wordsWithVowels.add(word);
                vowelCountMap.put(word, count);
            }
        }
        // Sort the list based on vowel count in descending order
        Collections.sort(wordsWithVowels, new Comparator<String>() {
            public int compare(String w1, String w2) {
                return vowelCountMap.get(w2) - vowelCountMap.get(w1);
            }
        });

        // Print the sorted words
        System.out.println("Words sorted by number of vowels (most to least):");
        for (String word : wordsWithVowels) {
            System.out.println(word + " (vowels: " + vowelCountMap.get(word) + ")");
        }
    }
}
