package WhoLikesIt;

public class Main {
    public static void main(String[] args) {
        //My Solution
        System.out.println();
        System.out.println("My Solution");
        System.out.println(MySolution.whoLikesIt());
        System.out.println(MySolution.whoLikesIt("Peter"));
        System.out.println(MySolution.whoLikesIt("Alex", "Jacob"));
        System.out.println(MySolution.whoLikesIt("Mirco", "Ronny", "Gina"));
        System.out.println(MySolution.whoLikesIt("Simon", "Slavko", "Tobias", "Jean-Claude", "Hugo"));
        //Best Practice
        System.out.println();
        System.out.println("Best Practice");
        System.out.println(BestPractice.whoLikesIt());
        System.out.println(BestPractice.whoLikesIt("Peter"));
        System.out.println(BestPractice.whoLikesIt("Alex", "Jacob"));
        System.out.println(BestPractice.whoLikesIt("Mirco", "Ronny", "Gina"));
        System.out.println(BestPractice.whoLikesIt("Simon", "Slavko", "Tobias", "Jean-Claude", "Hugo"));
    }
}