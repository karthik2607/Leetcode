//3
//31.5.24
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int len=0;
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<>();
        while(right<n){
            if(mp.containsKey(s.charAt(r))){
                left=Math.max(left,mp.get(s.charAt(r))+1);
            }
            mp.put(s.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
        
    }
}
