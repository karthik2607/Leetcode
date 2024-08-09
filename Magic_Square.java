//840
//9.8.24
//https://leetcode.com/problems/magic-squares-in-grid/description/?envType=daily-question&envId=2024-08-09

// A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

// Given a row x col grid of integers, how many 3 x 3 contiguous magic square subgrids are there?

// Note: while a magic square can only contain numbers from 1 to 9, grid may contain numbers up to 15.

 

// Example 1:


// Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
// Output: 1
// Explanation: 
// The following subgrid is a 3 x 3 magic square:

// while this one is not:

// In total, there is only one magic square inside the given grid.
// Example 2:

// Input: grid = [[8]]
// Output: 0
 

// Constraints:

// row == grid.length
// col == grid[i].length
// 1 <= row, col <= 10
// 0 <= grid[i][j] <= 15


class Solution {

    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int row = 0; row + 2 < m; row++) {
            for (int col = 0; col + 2 < n; col++) {
                if (isMagicSquare(grid, row, col)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean isMagicSquare(int[][] grid, int row, int col) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = grid[row + i][col + j];
                if (num < 1 || num > 9) return false;
                if (seen[num]) return false;
                seen[num] = true;
            }
        }

        // check if diagonal sums are same value
        int diagonal1 =
            grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2];
        int diagonal2 =
            grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2];

        if (diagonal1 != diagonal2) return false;

        // check if all row sums share the same value as the diagonal sums
        int row1 = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
        int row2 =
            grid[row + 1][col] +
            grid[row + 1][col + 1] +
            grid[row + 1][col + 2];
        int row3 =
            grid[row + 2][col] +
            grid[row + 2][col + 1] +
            grid[row + 2][col + 2];

        if (!(row1 == diagonal1 && row2 == diagonal1 && row3 == diagonal1)) {
            return false;
        }

        // check if all column sums share same value as the diagonal sums
        int col1 = grid[row][col] + grid[row + 1][col] + grid[row + 2][col];
        int col2 =
            grid[row][col + 1] +
            grid[row + 1][col + 1] +
            grid[row + 2][col + 1];
        int col3 =
            grid[row][col + 2] +
            grid[row + 1][col + 2] +
            grid[row + 2][col + 2];

        if (!(col1 == diagonal1 && col2 == diagonal1 && col3 == diagonal2)) {
            return false;
        }

        return true;
    }
}