package _05_Mumbling;

import static java.io.File.separator;

public class MySolution {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0, offset = 0; offset < s.length(); i++) {
            int codePoint = s.codePointAt(offset);
            int charCount = Character.charCount(codePoint);

            result.append(new String(Character.toChars(Character.toUpperCase(codePoint))));

            for (int j = 0; j < i; ++j) {
                result.append(new String(Character.toChars(Character.toLowerCase(codePoint))));
            }

            if (offset + charCount < s.length()) {
                result.append("-");
            }

            offset += charCount;
        }

        return result.toString();

    }

}

