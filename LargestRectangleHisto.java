//84
//Need to be revised  montonic stack
//https://leetcode.com/problems/largest-rectangle-in-histogram/description/
//29.5.24

// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

// Example 1:


// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The above is a histogram where width of each bar is 1.
// The largest rectangle is shown in the red area, which has an area = 10 units.
// Example 2:


// Input: heights = [2,4]
// Output: 4
 

// Constraints:

// 1 <= heights.length <= 105
// 0 <= heights[i] <= 104

import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        int maxArea=0;
        int n=heights.length;

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                int index=st.pop();
                int ht=heights[index];
                area=ht*(st.isEmpty()?i:i-st.peek()-1);
                maxArea=Math.max(maxArea,area);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int index=st.pop();
            int ht=heights[index];
            area=ht*(st.isEmpty()?n:n-st.peek()-1);
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
        
    }
}