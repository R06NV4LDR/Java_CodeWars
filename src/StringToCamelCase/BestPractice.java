package StringToCamelCase;

import java.util.Arrays;

public class BestPractice {
    static String toCamelCase(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior")); // Output: theStealthWarrior
        System.out.println(toCamelCase("The_Stealth_Warrior")); // Output: TheStealthWarrior
        System.out.println(toCamelCase("The_Stealth-Warrior")); // Output: TheStealthWarrior
    }
}

