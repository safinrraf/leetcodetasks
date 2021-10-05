package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAreaOfIslandTest {

    private final MaxAreaOfIsland mMaxAreaOfIsland = new MaxAreaOfIsland();

    @Test
    void maxAreaOfIsland1() {
        final int grid[][] = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        final int expected = 6;
        final int test = mMaxAreaOfIsland.maxAreaOfIsland(grid);
        assertEquals(expected, test);
    }

    @Test
    void maxAreaOfIsland2() {
        final int grid[][] = {
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        final int expected = 0;
        final int test = mMaxAreaOfIsland.maxAreaOfIsland(grid);
        assertEquals(expected, test);
    }

    @Test
    void maxAreaOfIsland3() {
        final int grid[][] = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
        };
        final int expected = 9;
        final int test = mMaxAreaOfIsland.maxAreaOfIsland(grid);
        assertEquals(expected, test);
    }

    @Test
    void maxAreaOfIsland4() {
        final int grid[][] = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1},
        };
        final int expected = 1;
        final int test = mMaxAreaOfIsland.maxAreaOfIsland(grid);
        assertEquals(expected, test);
    }
}