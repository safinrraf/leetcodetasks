package org.safin;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        return bsearch(nums, 0, nums.length - 1, target);
    }

    public int bsearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return low;
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
