package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    private final ReverseString mReverseString = new ReverseString();

    @Test
    void reverseString1() {
        final char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        final char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        mReverseString.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void reverseString2() {
        final char[] input = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        final char[] expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        mReverseString.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void reverseString3() {
        final char[] input = new char[]{'r'};
        final char[] expected = new char[]{'r'};
        mReverseString.reverseString(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void reverseString4() {
        final char[] input = new char[]{};
        final char[] expected = new char[]{};
        mReverseString.reverseString(input);
        assertArrayEquals(expected, input);
    }
}