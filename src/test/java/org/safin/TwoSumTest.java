package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum mTwoSum = new TwoSum();

    @Test
    void twoSum1() {
        final int[] numbers = new int[]{2, 7, 11, 15};
        final int target = 9;
        final int[] expected = new int[]{1, 2};
        final int[] test = mTwoSum.twoSum(numbers, target);
        assertArrayEquals(expected, test);
    }

    @Test
    void twoSum2() {
        final int[] numbers = new int[]{2, 3, 4};
        final int target = 6;
        final int[] expected = new int[]{1, 3};
        final int[] test = mTwoSum.twoSum(numbers, target);
        assertArrayEquals(expected, test);
    }

    @Test
    void twoSum3() {
        final int[] numbers = new int[]{-1, 0};
        final int target = -1;
        final int[] expected = new int[]{1, 2};
        final int[] test = mTwoSum.twoSum(numbers, target);
        assertArrayEquals(expected, test);
    }
}