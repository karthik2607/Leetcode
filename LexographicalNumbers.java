//386
//https://leetcode.com/problems/lexicographical-numbers/description/?envType=daily-question&envId=2024-09-21
//22.9.24

// Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.

// You must write an algorithm that runs in O(n) time and uses O(1) extra space. 

 

// Example 1:

// Input: n = 13
// Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
// Example 2:

// Input: n = 2
// Output: [1,2]
 

// Constraints:

// 1 <= n <= 5 * 104

import java.util.*;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>l=new ArrayList<>();
        int curr=1;
        for(int i=0;i<n;i++){
            l.add(curr);

            if(curr*10<=n){
                curr*=10;
            }else{
                while(curr%10==9 || curr>=n){
                    curr/=10;
                }
                curr+=1;
            }
        }
        return l;

        
    }
}