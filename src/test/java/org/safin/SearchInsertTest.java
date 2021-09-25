package org.safin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertTest {

    private final SearchInsert mSearchInsert = new SearchInsert();

    @Test
    void testExample1() {
        final int[] nums = new int[]{1, 3, 5, 6};
        final int target = 5;
        final int expected = 2;
        final int test = mSearchInsert.searchInsert(nums, target);
        assertEquals(expected, test);
    }

    @Test
    void testExample2() {
        final int[] nums = new int[]{1, 3, 5, 6};
        final int target = 2;
        final int expected = 1;
        final int test = mSearchInsert.searchInsert(nums, target);
        assertEquals(expected, test);
    }

    @Test
    void testExample3() {
        final int[] nums = new int[]{1, 3, 5, 6};
        final int target = 7;
        final int expected = 4;
        final int test = mSearchInsert.searchInsert(nums, target);
        assertEquals(expected, test);
    }

    @Test
    void testExample4() {
        final int[] nums = new int[]{1, 3, 5, 6};
        final int target = 0;
        final int expected = 0;
        final int test = mSearchInsert.searchInsert(nums, target);
        assertEquals(expected, test);
    }

    @Test
    void testExample5() {
        final int[] nums = new int[]{1};
        final int target = 0;
        final int expected = 0;
        final int test = mSearchInsert.searchInsert(nums, target);
        assertEquals(expected, test);
    }
}