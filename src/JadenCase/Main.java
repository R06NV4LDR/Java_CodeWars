package JadenCase;

public class Main {
    public static void main(String[] args) {

        // von BestPractice wird eine Instanz hier in der Main Methode erzeugt
        BestPractice bestPractice = new BestPractice();

        System.out.println(bestPractice.toJadenCase("how can mirrors be real if our eyes aren't real"));

        // MySolution wird als "public static String" direkt aufgerufen
        System.out.println(MySolution.toJadenCase("how can mirrors be real if our eyes aren't real"));
    }
}
