//215
//3.6.24
//https://leetcode.com/problems/kth-largest-element-in-an-array/description/

//Using priority used minHeap here


// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Can you solve it without sorting?

 

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4



import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.offer(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.poll();
        
    }
}