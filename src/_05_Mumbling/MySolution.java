package _05_Mumbling;

import java.util.StringJoiner;

import static java.io.File.separator;

public class MySolution {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;

//        s.codePoints()
//                .map(codPoint -> {
//                  // magic
//                })
//                .collect(StringBuilder::new, "-"):
        for (int offset = 0; offset < s.length(); ) {
            int codePoint = s.codePointAt(offset);
            if (Character.isEmojiComponent(codePoint)) {
                ++offset;
                continue;
            }
            int charCount = Character.charCount(codePoint);

            result.append(new String(Character.toChars(Character.toUpperCase(codePoint))));

            String str = new String(Character.toChars(Character.toLowerCase(codePoint)));
            for (int j = 0; j < counter; ++j) {
                result.append(str);
            }
            ++counter;

            if (offset + charCount < s.length() /*&& !Character.isEmoji(codePoint)*/) {
                result.append("-");
            }

            offset += charCount;
        }

        return result.toString();

    }

}

