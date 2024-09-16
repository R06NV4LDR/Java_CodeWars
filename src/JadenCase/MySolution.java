package JadenCase;

public class MySolution {
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        String[] words = phrase.split(" ");
        StringBuilder jadenCase = new StringBuilder();


        for (String word : words) {
            if (!word.isEmpty()) {
                jadenCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return jadenCase.toString().trim();
    }
}
