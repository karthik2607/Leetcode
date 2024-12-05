//49
//https://leetcode.com/problems/group-anagrams/description/?envType=study-plan-v2&envId=top-interview-150
//5.12.24

// Given an array of strings strs, group the 
// anagrams
//  together. You can return the answer in any order.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
// Example 2:

// Input: strs = [""]

// Output: [[""]]

// Example 3:

// Input: strs = ["a"]

// Output: [["a"]]

 

// Constraints:

// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.


package Hashmap;

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>hmap=new HashMap<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            hmap.computeIfAbsent(sorted,k ->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(hmap.values());
        
    }
}

