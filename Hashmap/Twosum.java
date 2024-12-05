//1
//https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
//5.12.24


//newer approach using hashmap


// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
 

// Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

package Hashmap;

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int i, j;
        // for (i = 0; i < nums.length; i++) {
        //     for (j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }
        // return new int[] {};

        Map<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(hmap.containsKey(comp)){
                return new int[]{hmap.get(comp),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}
