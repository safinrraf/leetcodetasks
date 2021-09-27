package org.safin;

public class MoveZeroes {
    /**
     * Not space optimal
     *
     * @param nums input array
     */
    public void moveZeroes1(int[] nums) {
        final int[] result = new int[nums.length];
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[pos++] = nums[i];
            }
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    /**
     * Space optimal
     *
     * @param nums input array
     */
    public void moveZeroes2(int[] nums) {
        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero++] = nums[i];
            }
        }
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * Space and operation optimal
     *
     * @param nums input array
     */
    public void moveZeroes(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                final int tmp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = tmp;
                lastNonZeroFoundAt++;
            }
        }
    }
}
