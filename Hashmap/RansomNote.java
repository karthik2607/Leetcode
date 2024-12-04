package Hashmap;

//383
//https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
//4.12.24

// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true
 

// Constraints:

// 1 <= ransomNote.length, magazine.length <= 105
// ransomNote and magazine consist of lowercase English letters.


import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            if(!hmap.containsKey(c)){
                hmap.put(c,1);
            }else{
                hmap.put(c,hmap.get(c)+1);
            }

        }

        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(hmap.containsKey(c) && hmap.get(c)>0){
                hmap.put(c,hmap.get(c)-1);
            }else{
                return false;
            }
        }
        return true;


        
    }
}