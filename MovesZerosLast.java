//283
//1/6/24
//https://leetcode.com/problems/move-zeroes/description/

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            nums[i]=0;
        }                
    }
}