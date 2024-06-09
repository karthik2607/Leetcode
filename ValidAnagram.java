//242
//8.6.24
//https://leetcode.com/problems/valid-anagram/description/

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.


import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char temp[]=s.toCharArray();
        char temp1[]=t.toCharArray();
        Arrays.sort(temp);
        Arrays.sort(temp1);
        String s1=new String(temp);
        String s2=new String(temp1);

        if(s1.equals(s2)) return true;
        return false;        
    }
}