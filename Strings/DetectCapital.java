//520
//https://leetcode.com/problems/detect-capital/description/
//26.12.24
// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

 

// Example 1:

// Input: word = "USA"
// Output: true
// Example 2:

// Input: word = "FlaG"
// Output: false
 

// Constraints:

// 1 <= word.length <= 100
// word consists of lowercase and uppercase English letters.

package Strings;
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()<2) return true;
        if(Character.isUpperCase(word.charAt(0))){
            if(Character.isUpperCase(word.charAt(1))){
                for(int i=2;i<word.length();i++){
                    if(!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }else{
                for(int i=2;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            }
        }else{
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }

            }
        }
        return true;
    
    
    }
}

