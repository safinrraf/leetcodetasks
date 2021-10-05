package org.safin;

public class MaxAreaOfIsland {
    private static final int LAND = 1;

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    final int tmp = scanIsland(grid, i, j);
                    if (maxArea < tmp) {
                        maxArea = tmp;
                    }
                }
            }
        }
        return maxArea;
    }

    public int scanIsland(int[][] grid, int r, int c) {
        int result = 0;
        if (grid[r][c] == LAND) {
            result++;
            grid[r][c] = -1; // Mark Land as seen
            if (r >= 1) {
                result += scanIsland(grid, r - 1, c);
            }
            if (c >= 1) {
                result += scanIsland(grid, r, c - 1);
            }
            if (r + 1 < grid.length) {
                result += scanIsland(grid, r + 1, c);
            }
            if (c + 1 < grid[0].length) {
                result += scanIsland(grid, r, c + 1);
            }
        }
        return result;
    }
}
