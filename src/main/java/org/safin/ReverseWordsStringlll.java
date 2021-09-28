package org.safin;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create array of strings using {@code split}
 * Reverse single string from array using {@code reverseString}
 * Append reversed string to {@link StringBuilder}
 */
public class ReverseWordsStringlll {
    /**
     * @param s input string
     * @return string with reversed words
     */
    public String reverseWords(String s) {
        final StringBuilder sb = new StringBuilder();
        final String[] sa = s.split(" ");
        IntStream.range(0, sa.length).forEach(i -> {
            sb.append(reverseString(sa[i]));
            if (i != sa.length - 1) {
                sb.append(' ');
            }
        });
        return sb.toString();
    }

    public String reverseString(String str) {
        return IntStream
                .iterate(str.length() - 1, i -> i >= 0, i -> i - 1)
                .mapToObj(i -> String.valueOf(str.charAt(i)))
                .collect(Collectors.joining());
    }

    public String reverseWordsNotMy(String s) {
        final char[] t = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int start = i;
            while (i < s.length() && t[i] != ' ') {
                i++;
            }
            int end = i - 1;
            while (start < end) {
                char temp = t[start];
                t[start++] = t[end];
                t[end--] = temp;
            }
        }
        return new String(t);

    }

    public String reverseWordsAgainNotMy(String s) {
        final StringBuilder sBuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int start = i;
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }
            for (int j = i - 1; j >= start; j--) {
                sBuilder.append(s.charAt(j));
            }
            if (i < s.length() && s.charAt(i) == ' ') {
                sBuilder.append(' ');
                i++;
            }
        }
        return sBuilder.toString();
    }
}
