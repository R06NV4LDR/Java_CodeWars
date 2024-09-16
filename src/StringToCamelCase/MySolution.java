package StringToCamelCase;

public class MySolution {

    static String toCamelCase(String s) {
        // Split the string using dash or underscore as the delimiter
        String[] words = s.split("[_-]");

        // Create a StringBuilder to construct the final string
        StringBuilder builder = new StringBuilder();

        // Iterate through the split words
        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            if (i == 0) {
                // If it's the first word, append it as it is
                builder.append(word);
            } else {
                // For subsequent words, capitalize the first letter and append the rest of the word in lowercase
                builder.append(Character.toUpperCase(word.charAt(0)) + word.substring(1));
            }
        }

        return builder.toString();
    }
}


