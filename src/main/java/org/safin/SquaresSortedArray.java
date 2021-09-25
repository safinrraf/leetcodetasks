package org.safin;

import java.util.Arrays;

public class SquaresSortedArray {
    /**
     * My implementation
     *
     * @param nums array
     * @return squared array
     */
    public int[] sortedSquares(int[] nums) {
        final int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    public int[] sortedSquaresNotMy(int[] nums) {
        int[] squares = new int[nums.length];
        int l = 0, r = nums.length - 1, i = r;
        while (l <= r) {
            if (Math.abs(nums[l]) >= Math.abs(nums[r])) {
                squares[i] = nums[l] * nums[l];
                l++;
            } else {
                squares[i] = nums[r] * nums[r];
                r--;
            }
            i--;
        }

        return squares;
    }
}
