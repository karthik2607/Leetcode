//11
//https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-interview-150
//5.12.24



// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1
 

// Constraints:

// n == height.length
// 2 <= n <= 105
// 0 <= height[i] <= 104


package Arrays;

class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(res, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

        }
        return res;

    }
}

