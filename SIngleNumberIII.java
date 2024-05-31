//260
//SINGLE NUMBER III
//31.5.24
//https://leetcode.com/problems/single-number-iii/description/?envType=daily-question&envId=2024-05-31


// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

// Example 1:

// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.
// Example 2:

// Input: nums = [-1,0]
// Output: [-1,0]
// Example 3:

// Input: nums = [0,1]
// Output: [1,0]
 

// Constraints:

// 2 <= nums.length <= 3 * 104
// -231 <= nums[i] <= 231 - 1
// Each integer in nums will appear twice, only two integers will appear once.


//Check out the Entry part write Map.Entry<Integer,Integer>entry for specifying types

import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer>l=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()== 1){
                l.add(entry.getKey());
                
            }
        }
       int res[]=new int[l.size()];
       for(int i=0;i<l.size();i++){
        res[i]=l.get(i);
       }
        return  res;
        
    }
}