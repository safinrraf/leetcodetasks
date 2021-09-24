package org.safin;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private final BinarySearch mBinarySearch = new BinarySearch();

    @Test
    void search() {
        final int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        final int target = 9;
        final int test = mBinarySearch.search(nums, target);
        assertEquals(4, test);
    }

    @Test
    void search1() {
        final int[] nums = new int[]{};
        final int target = 9;
        final int test = mBinarySearch.search(nums, target);
        assertEquals(-1, test);
    }

    @Test
    void search2() {
        final int[] nums = new int[]{999999};
        final int target = 999999;
        final int test = mBinarySearch.search(nums, target);
        assertEquals(0, test);
    }

    @Test
    void search3() {
        final int[] nums = new int[]{999999};
        final int target = 0;
        final int test = mBinarySearch.search(nums, target);
        assertEquals(-1, test);
    }

    @Test
    void search4() {
        long startTime = System.nanoTime();

        final int arrSize = 99_999_999;
        final int target = 214748;
        final int[] nums = new int[arrSize];
        IntStream.range(0, arrSize).forEach(i -> nums[i] = i);
        final int test = mBinarySearch.search(nums, target);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        assertEquals(target, test);
        System.out.printf("Time spent %d%n", duration);
    }

    @Test
    void search5() {
        long startTime = System.nanoTime();

        final int arrSize = 99_999_999;
        final int target = -214748;
        final int[] nums = new int[arrSize];
        IntStream.range(0, arrSize).forEach(i -> nums[i] = i);
        final int test = mBinarySearch.search(nums, target);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        assertEquals(-1, test);
        System.out.printf("Time spent %d%n", duration);
    }

    @Test
    void search45() {
        long startTime = System.nanoTime();

        final int arrSize = 99_999_999;
        final int target = 214748;
        final int[] nums = new int[arrSize];
        IntStream.range(0, arrSize).forEach(i -> nums[i] = i);
        final int test = mBinarySearch.slowSearch(nums, target);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        assertEquals(target, test);
        System.out.printf("Time spent %d%n", duration);
    }

    @Test
    void search6() {
        final int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        final int target = 13;
        final int test = mBinarySearch.search(nums, target);
        assertEquals(-1, test);
    }
}