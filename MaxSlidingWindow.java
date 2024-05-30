//239 Maximum Sliding Window
//https://leetcode.com/problems/sliding-window-maximum/description/
//30.5.24


// You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

// Return the max sliding window.

 

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// 1 <= k <= nums.length



import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];

        //Brute force TLE
        // int n=nums.length;
        // int[] arr=new int[n-k+1];
        
        // for(int i=0;i<=n-k;i++){
        //     int maximum= Integer.MIN_VALUE;
        //     for(int j=i;j<i+k;j++){
        //          maximum=Math.max(maximum,nums[j]);
        //     }
        //     arr[i]=maximum;

        // }
        // return arr;

        //Using deque
        int n=nums.length;
        Deque<Integer>dq=new LinkedList<>();
        int arr[]=new int[n-k+1];
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){
                arr[i-k+1]=nums[dq.peekFirst()];
            }

        }
        return arr;

        
    }
}