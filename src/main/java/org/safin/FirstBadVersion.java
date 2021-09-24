package org.safin;

import java.util.Set;
import java.util.TreeSet;

public class FirstBadVersion {

    /**
     * (Linear Scan) [Time Limit Exceeded]
     * @param n
     * @return first bad version
     */
    public int firstBadVersionMySlowSolution(int n) {
        final Set<Integer> set = new TreeSet<>();
        int currentBadVersion = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (i < currentBadVersion) {
                if (isBadVersion(i)) {
                    System.out.println("+");
                    currentBadVersion = i;
                    set.add(i);
                }
            }
        }
        return set.iterator().next();
    }

    /**
     * Copied from leetcode solution
     * @param n max version
     * @return first bad version
     */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * My version with recursion
     * @param n number of version
     * @return first bad version
     */
    public int firstBadVersionMy(int n) {
        return bsearch(1, n);
    }

    public int bsearch(int low, int high) {
        if (low > high) {
            return low;
        } else {
            final int mid = low + ((high - low) / 2);

            if(isBadVersion(mid)) {
                return bsearch(low, mid - 1);
            } else {
                return bsearch(mid + 1, high);
            }
        }
    }

    boolean isBadVersion(int version) {
        return version > 5;
    }
}
