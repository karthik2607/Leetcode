// 136
//Single number this can be solved using Bit manipulation using xor
//Also i tried using Hashmap to solve the problem
//https://leetcode.com/problems/single-number/description/



// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1
 

// Constraints:

// 1 <= nums.length <= 3 * 104
// -3 * 104 <= nums[i] <= 3 * 104
// Each element in the array appears twice except for one element which appears only once.

//xor solution
class SingleNumber {
    public static int s_Number(int[] nums) {
        int res=0;
        for(int i:nums){
            res=res^i;
        }
        return res;
    }

    public static void main(String[] args){
        int nums[]={4,2,1,1,2};
        int out=s_Number(nums);
        System.out.println(out);

    }
}

//hashmap solution
// class Solution {
//     public int singleNumber(int[] nums) {
        
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int num:nums){
//             if(map.containsKey(num)){
//                 map.put(num,map.get(num)+1);
//             }else{
//                 map.put(num,1);
//             }
//         }
//         for(Map.Entry<Integer,Integer>entry:map.entrySet()){
//             if(entry.getValue()==1){
//                 return entry.getKey();
//             }
//         }
//         return 1;
//                }
        
//     }

