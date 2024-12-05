//290
//https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
//5.12.24

// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.
 

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"

// Output: true

// Explanation:

// The bijection can be established as:

// 'a' maps to "dog".
// 'b' maps to "cat".
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"

// Output: false

// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"

// Output: false

 

// Constraints:

// 1 <= pattern.length <= 300
// pattern contains only lower-case English letters.
// 1 <= s.length <= 3000
// s contains only lowercase English letters and spaces ' '.
// s does not contain any leading or trailing spaces.
// All the words in s are separated by a single space.


package Hashmap;

import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length) return false;
        Map<Character,String> hmapp= new HashMap<>();
        Map<String,Character> hmaps =new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            String word=words[i];
            char c=pattern.charAt(i);

            if(hmapp.containsKey(c)){
                if(!hmapp.get(c).equals(word)){
                    return false;
                }
            }else{
                hmapp.put(c,word);
            }

            if(hmaps.containsKey(word)){
                if(hmaps.get(word)!=c){
                    return false;
                }
            }else{
                hmaps.put(word,c);
            }

        }
        return true;
        
    }
}

