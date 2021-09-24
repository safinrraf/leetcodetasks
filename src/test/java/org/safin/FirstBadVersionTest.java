package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {

    private final FirstBadVersion mFirstBadVersion =
            new FirstBadVersion();

    @Test
    void firstBadVersion() {
        final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        final int test = mFirstBadVersion.firstBadVersionMy(17);
        assertEquals(12, test);
    }
}