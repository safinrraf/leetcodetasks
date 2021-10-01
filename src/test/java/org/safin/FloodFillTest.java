package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FloodFillTest {

    private final FloodFill mFloodFill = new FloodFill();

    @Test
    void floodFill() {
        final int sr = 1;
        final int sc = 1;
        final int newColor = 2;
        final int[][] image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        final int[][] expected = new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        final int[][] test = mFloodFill.floodFill(image, sr, sc, newColor);
        assertArrayEquals(expected, test);
    }
}