package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PermutationInStringTest {

    private final PermutationInString mPermutationInString = new PermutationInString();

    @Test
    void checkInclusion1() {
        final String s1 = "ab";
        final String s2 = "eidbaooo";
        assertTrue(
                mPermutationInString.checkInclusion(s1, s2)
        );
    }

    @Test
    void checkInclusion2() {
        final String s1 = "ab";
        final String s2 = "eidboaoo";
        assertFalse(mPermutationInString.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion3() {
        final String s1 = "a";
        final String s2 = "b";
        assertFalse(mPermutationInString.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion4() {
        final String s1 = "a";
        final String s2 = "a";
        assertTrue(mPermutationInString.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion5() {
        final String s1 = "abc";
        final String s2 = "cba";
        assertTrue(mPermutationInString.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion6() {
        final String s1 = "abc";
        final String s2 = "jkdhfgksldajhkldskcabadjfhaljfhkslsdajfh";
        assertTrue(mPermutationInString.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion7() {
        final String s1 = "abcd";
        final String s2 = "abc";
        assertFalse(mPermutationInString.checkInclusion(s1, s2));
    }
}