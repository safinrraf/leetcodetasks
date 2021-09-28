package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsStringlllTest {

    private final ReverseWordsStringlll mReverseWordsStringlll = new ReverseWordsStringlll();

    @Test
    void reverseWords1() {
        final String input = "Let's take LeetCode contest";
        final String expected = "s'teL ekat edoCteeL tsetnoc";
        final String test = mReverseWordsStringlll.reverseWords(input);
        assertEquals(expected, test);
    }

    @Test
    void reverseWords2() {
        final String input = "God Ding";
        final String expected = "doG gniD";
        final String test = mReverseWordsStringlll.reverseWords(input);
        assertEquals(expected, test);
    }

    @Test
    void reverseWords3() {
        final String input = "";
        final String expected = "";
        final String test = mReverseWordsStringlll.reverseWords(input);
        assertEquals(expected, test);
    }

    @Test
    void reverseWords4() {
        final String input = "w";
        final String expected = "w";
        final String test = mReverseWordsStringlll.reverseWords(input);
        assertEquals(expected, test);
    }

    @Test
    void reverseString1() {
        final String input = "test";
        final String expected = "tset";
        final String test = mReverseWordsStringlll.reverseString(input);
        assertEquals(expected, test);
    }

    @Test
    void reverseString2() {
        final String input = "0";
        final String expected = "0";
        final String test = mReverseWordsStringlll.reverseString(input);
        assertEquals(expected, test);
    }

    @Test
    void reverseString3() {
        final String input = "";
        final String expected = "";
        final String test = mReverseWordsStringlll.reverseString(input);
        assertEquals(expected, test);
    }

    @Test
    void reverseString4() {
        final String input = "'!2";
        final String expected = "2!'";
        final String test = mReverseWordsStringlll.reverseString(input);
        assertEquals(expected, test);
    }
}