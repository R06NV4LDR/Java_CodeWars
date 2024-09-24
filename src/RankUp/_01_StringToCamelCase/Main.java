package RankUp._01_StringToCamelCase;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("My Solution");
        System.out.println(MySolution.toCamelCase("the-stealth-warrior")); // Output: theStealthWarrior
        System.out.println(MySolution.toCamelCase("The_Stealth_Warrior")); // Output: TheStealthWarrior
        System.out.println(MySolution.toCamelCase("The_Stealth-Warrior")); // Output: TheStealthWarrior

        System.out.println();
        System.out.println("Best Practice");
        System.out.println(BestPractice.toCamelCase("the-stealth-warrior")); // Output: theStealthWarrior
        System.out.println(BestPractice.toCamelCase("The_Stealth_Warrior")); // Output: TheStealthWarrior
        System.out.println(BestPractice.toCamelCase("The_Stealth-Warrior")); // Output: TheStealthWarrior

    }
}