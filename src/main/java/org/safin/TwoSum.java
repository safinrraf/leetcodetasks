package org.safin;

public class TwoSum {

    public int[] twoSumBruteForce(int[] numbers, int target) {
        final int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] + numbers[k] == target) {
                    result[0] = i + 1;
                    result[1] = k + 1;
                }
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] + nums[end] == target) {
                return new int[]{start + 1, end + 1};
            } else if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{};
    }
}
