package org.safin;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        } else {
            return bsearch(nums, 0, nums.length - 1, target);
        }
    }

    public int searchNotMySolution(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int slowSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public int bsearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        } else {
            final int mid = (low + high) / 2;
            final int midvalue = nums[mid];

            if (target == midvalue) {
                return mid;
            } else if (target < midvalue) {
                return bsearch(nums, low, mid - 1, target);
            } else {
                return bsearch(nums, mid + 1, high, target);
            }
        }
    }
}
