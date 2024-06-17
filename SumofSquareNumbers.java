//633
//17.6.24
//Two pointers
//https://leetcode.com/problems/sum-of-square-numbers/description/?envType=daily-question&envId=2024-06-17

// Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

// Example 1:

// Input: c = 5
// Output: true
// Explanation: 1 * 1 + 2 * 2 = 5
// Example 2:

// Input: c = 3
// Output: false
 

// Constraints:

// 0 <= c <= 231 - 1


class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            if(left*left+right*right==c) return true;
            else if(left*left+right*right>c) right--;
            else left++;
        }
        return false;


        
    }
}