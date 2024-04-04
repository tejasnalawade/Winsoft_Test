import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string with some words. This string contains words.";

        HashMap<String, Integer> wordCount = new HashMap<>();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Count the occurrence of each word
        for (String word : words) {
            // Remove punctuation marks if needed
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            // Convert to lowercase to avoid case sensitivity
            word = word.toLowerCase();

            // Update the count in the HashMap
            if (word.length() > 0) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Print the word count
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}