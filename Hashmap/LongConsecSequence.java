//128
//https://leetcode.com/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-interview-150
//5.12.24


// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109

package Hashmap;

import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>hset=new HashSet<>();
        for(int num:nums){
            hset.add(num);
        }

        int LongStreak=0;

        for(int num:nums){
            if(!hset.contains(num-1)){
                int currentNumber=num;
                int currentStreak=1;
            
            while(hset.contains(currentNumber+1)){
                currentNumber++;
                currentStreak++;

                
            }

            LongStreak=Math.max(LongStreak,currentStreak);
            }
        }

        return LongStreak;


        
    }
}