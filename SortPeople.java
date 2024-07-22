//2418
//22.07.2024
//https://leetcode.com/problems/sort-the-people/description/?envType=daily-question&envId=2024-07-22


// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.

 

// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:

// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 

// Constraints:

// n == names.length == heights.length
// 1 <= n <= 103
// 1 <= names[i].length <= 20
// 1 <= heights[i] <= 105
// names[i] consists of lower and upper case English letters.
// All the values of heights are distinct.


import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] res=new String[names.length];
        Map<Integer,String>mp=new HashMap<>();
        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        int index=0;

        for(int i=heights.length-1;i>=0;i--)
        {
            res[index]=mp.get(heights[i]);
            index++;

        }
        return res;
    }
}

