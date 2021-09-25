package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class SquaresSortedArrayTest {

    final SquaresSortedArray mSquaresSortedArray = new SquaresSortedArray();

    @Test
    void sortedSquares1() {
        final int[] nums = new int[]{-4, -1, 0, 3, 10};
        final int[] expected = new int[]{0, 1, 9, 16, 100};
        final int[] test = mSquaresSortedArray.sortedSquaresNotMy(nums);
        assertArrayEquals(expected, test);
    }

    @Test
    void sortedSquares2() {
        final int[] nums = new int[]{-7, -3, 2, 3, 11};
        final int[] expected = new int[]{4, 9, 9, 49, 121};
        final int[] test = mSquaresSortedArray.sortedSquaresNotMy(nums);
        assertArrayEquals(expected, test);
    }
}