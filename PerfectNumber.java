//507
//12.6.24
//https://leetcode.com/problems/perfect-number/description/

// A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

// Given an integer n, return true if n is a perfect number, otherwise return false.

 

// Example 1:

// Input: num = 28
// Output: true
// Explanation: 28 = 1 + 2 + 4 + 7 + 14
// 1, 2, 4, 7, and 14 are all divisors of 28.
// Example 2:

// Input: num = 7
// Output: false
 

// Constraints:

// 1 <= num <= 108

class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1;
        int sum=0;
        while(i<num){
            if(num%i==0){
                sum+=i;


            }
            i++;
        }
        return sum==num;
        
    }
}