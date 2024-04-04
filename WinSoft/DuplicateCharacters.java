import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Convert the string to lowercase for case insensitivity
        str = str.toLowerCase();

        // Count the occurrence of each character in the string
        for (char c : str.toCharArray()) {
            // Ignore non-alphabetic characters
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.println(c);
            }
        }
    }
}