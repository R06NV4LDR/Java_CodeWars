package WhoLikesIt;

public class BestPractice {
    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this",names[0]);
            case 2: return String.format("%s and %s like this",names[0], names[1]);
            case 3: return names[0] + " and " + names[1] + " and " + names[2] + " likes this";
            default: return names[0] + " and " + names[1] + " and " + (names.length - 2) + " likes this";
        }
    }
}
