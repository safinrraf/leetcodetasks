package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    private final MoveZeroes mMoveZeroes = new MoveZeroes();

    @Test
    void moveZeroes1() {
        final int[] nums = new int[]{0, 1, 0, 3, 12};
        final int[] expected = new int[]{1, 3, 12, 0, 0};
        mMoveZeroes.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroes2() {
        final int[] nums = new int[]{0};
        final int[] expected = new int[]{0};
        mMoveZeroes.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroes3() {
        final int[] nums = new int[]{1, 3, 6, 0};
        final int[] expected = new int[]{1, 3, 6, 0};
        mMoveZeroes.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroes4() {
        final int[] nums = new int[]{};
        final int[] expected = new int[]{};
        mMoveZeroes.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}