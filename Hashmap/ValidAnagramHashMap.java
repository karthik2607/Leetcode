//242
//https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150
//5.12.24

// Given two strings s and t, return true if t is an 
// anagram
//  of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?


package Hashmap;

import java.util.*;


class Solution {
    public boolean isAnagram(String s, String t) {
        // char temp[]=s.toCharArray();
        // char temp1[]=t.toCharArray();
        // Arrays.sort(temp);
        // Arrays.sort(temp1);
        // String s1=new String(temp);
        // String s2=new String(temp1);

        // if(s1.equals(s2)) return true;
        // return false; 
        
        int cnt=0;

        if(s.length() != t.length()) return false;  

        Map<Character,Integer> hmaps=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hmaps.containsKey(c)){
               hmaps.put(c,1); 
            }else{
                hmaps.put(c,hmaps.get(c)+1);
            }
        }

        System.out.println(hmaps);

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(hmaps.containsKey(c) && hmaps.get(c)>0){
                hmaps.put(c,hmaps.get(c)-1);

            }
        }

        for(int val:hmaps.values()){
            if(val==0) cnt++;
        }
                System.out.println(hmaps);

        return hmaps.size()==cnt;
    }
}
