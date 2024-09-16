package WhoLikesIt;

public class MySolution {
    public static String whoLikesIt(String... names) {
        String[] array = new String[names.length];
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " likes this";
            case 3:
                return names[0] + " and " + names[1] + " and " + names[2] + " likes this";
            default:
                return names[0] + " and " + names[1] + " and " + (names.length - 2) + " likes this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Alex", "Jacob"));
        System.out.println(whoLikesIt("Mirco", "Ronny", "Gina"));
        System.out.println(whoLikesIt("Simon", "Slavko", "Tobias", "Jean-Claude", "Hugo"));
    }
}
