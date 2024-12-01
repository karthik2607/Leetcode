//1346
//1.12.24
//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/?envType=daily-question&envId=2024-12-01

// Given an array arr of integers, check if there exist two indices i and j such that :

// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]
 

// Example 1:

// Input: arr = [10,2,5,3]
// Output: true
// Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
// Example 2:

// Input: arr = [3,1,7,11]
// Output: false
// Explanation: There is no i and j that satisfy the conditions.
 

// Constraints:

// 2 <= arr.length <= 500
// -103 <= arr[i] <= 103

import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> hmap=new HashMap<>();

        for(int num:arr){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }

        for(int num:arr){
            if(num!=0 && hmap.containsKey(2*num)){
                return true;
            }

            if(num==0 && hmap.get(num)>1){
                return true;
            }
        }
        return false;


        
    }
}