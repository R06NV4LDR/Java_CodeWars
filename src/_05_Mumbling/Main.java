package _05_Mumbling;

// This time no story, no theory. The examples below show you how to write function accum:
// Examples:
// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"
//The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Main {
    public static void main(String[] args) {
        System.out.println("abcd            : " + MySolution.accum("abcd"));
        System.out.println("RRqaEzty        : " + MySolution.accum("RRqaEzty"));
        System.out.println("cwAt            : " + MySolution.accum("cwAt"));
        System.out.println("Ronny           : " + MySolution.accum("Ronny"));
        System.out.println("Freibadhausen   : " + MySolution.accum("Freibadhausen"));
        System.out.println("✌️💀😊️a️         : " + MySolution.accum("✌️💀😊️a"));
        System.out.println("✌️✌️✌️         : " + MySolution.accum("✌️️✌️✌️️"));
        System.out.println();
        System.out.println("abcd            : " + BestPractice.accum("abcd"));
        System.out.println("RqaEzty         : " + BestPractice.accum("RqaEzty"));
        System.out.println("cwAt            : " + BestPractice.accum("cwAt"));
        System.out.println("Ronny           : " + BestPractice.accum("Ronny"));
        System.out.println("Freibadhausen   : " + BestPractice.accum("Freibadhausen"));
        System.out.println("✌️💀😊️         : " + BestPractice.accum("✌️💀😊️️"));
        System.out.println("✌️✌️✌️         : " + BestPractice.accum("✌️️✌️✌️️"));
    }
}
