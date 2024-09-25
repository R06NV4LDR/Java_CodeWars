package Fundamentals._03_SquareEveryDigit;

//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
//
//Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
//
//Note: The function accepts an integer and returns an integer.
//
//Happy Coding!


public class SquareEveryDigit {
    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String numberStr = String.valueOf(n);

        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            result.append(digit * digit);
        }

        return Integer.parseInt(result.toString());
    }
}

// Best Practices

//import java.util.stream.Collectors;
//
//public class SquareDigit {
//
//    public int squareDigits(int n) {
//        return Integer.parseInt(String.valueOf(n)
//                .chars()
//                .map(i -> Integer.parseInt(String.valueOf((char) i)))
//                .map(i -> i * i)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining("")));
//    }
//}

//public class SquareDigit {
//
//    public int squareDigits(int n) {
//
//        String strDigits = String.valueOf(n);
//        String result = "";
//
//        for (char c : strDigits.toCharArray()) {
//            int digit = Character.digit(c, 10);
//            result += digit * digit;
//        }
//
//        return Integer.parseInt(result);
//    }
//}


// Sample Tests
//StringBuilder result = new StringBuilder();
//String numberStr = String.valueOf(n);
//
//        for (char digitChar : numberStr.toCharArray()) {
//int digit = Character.getNumericValue(digitChar);
//            result.append(digit * digit);
//        }
//
//                return Integer.parseInt(result.toString());