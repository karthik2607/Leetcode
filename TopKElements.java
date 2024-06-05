//347
//5.6.24
///Used custom comparator for priorityQueue for maxHeap (a,b)->b.getValue()-a.getValue()
//https://leetcode.com/problems/top-k-frequent-elements/description/




// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// k is in the range [1, the number of unique elements in the array].
// It is guaranteed that the answer is unique.
 

// Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.


import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k){

        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        PriorityQueue<Map.Entry<Integer,Integer>>maxHeap=new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()  //custom comaprator;//descending
        );
        maxHeap.addAll(mp.entrySet());

        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=maxHeap.poll().getKey();
        }
        
        return res;
    }
}