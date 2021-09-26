package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    private final RotateArray mRotateArray = new RotateArray();

    @Test
    void rotate1() {
        final int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        final int k = 3;
        final int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        mRotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotate2() {
        final int[] nums = new int[]{1};
        final int k = 3;
        final int[] expected = new int[]{1};
        mRotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotate3() {
        final int[] nums = new int[]{1, 2};
        final int k = 2;
        final int[] expected = new int[]{1, 2};
        mRotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotate4() {
        final int[] nums = new int[]{-1, -100, 3, 99};
        final int k = 2;
        final int[] expected = new int[]{3, 99, -1, -100};
        mRotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotate5() {
        final int[] nums = new int[]{-1, -100, 3, 99};
        final int k = 4;
        final int[] expected = new int[]{-1, -100, 3, 99};
        mRotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}