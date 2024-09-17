package _05_Mumbling;

public class MySolution {
    public static String accum(String s) {

        char[] array = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; ++i) {
            if (i < array.length -1 && Character.isSurrogatePair(array[i], array[i+1])) {
                System.out.println("Double Char found");
                String substring = new String();
                substring.();

            }
            result.append(Character.toUpperCase(array[i]));

            for (int j = 0; j < i; ++j) {
                result.append(Character.toLowerCase(array[i]));
            }

            if (i < array.length - 1) {
                result.append("-");
            }
        }

        return result.toString();
    }
}
