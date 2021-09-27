package org.safin;

public class ReverseString {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            final char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }

    public void reverseStringNotMySolution(char[] s) {
        int mid = s.length / 2;
        for (int i = 0, j = s.length - 1; i < mid; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
