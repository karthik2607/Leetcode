//1190
//11.7.24
//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/?envType=daily-question&envId=2024-07-11

// You are given a string s that consists of lower case English letters and brackets.

// Reverse the strings in each pair of matching parentheses, starting from the innermost one.

// Your result should not contain any brackets.

 

// Example 1:

// Input: s = "(abcd)"
// Output: "dcba"
// Example 2:

// Input: s = "(u(love)i)"
// Output: "iloveu"
// Explanation: The substring "love" is reversed first, then the whole string is reversed.
// Example 3:

// Input: s = "(ed(et(oc))el)"
// Output: "leetcode"
// Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
 

// Constraints:

// 1 <= s.length <= 2000
// s only contains lower case English characters and parentheses.
// It is guaranteed that all parentheses are balanced.




class Solution {
    int i=0;
    public String reverseParentheses(String s) {
        char[] arr=s.toCharArray();
        return helper(arr);
        
    }

    public String helper(char[] s){
        StringBuilder sb=new StringBuilder();

        while(i<s.length){
            if(s[i]==')'){
                i++;
                return sb.reverse().toString();
            }else if(s[i]=='('){
                i++;
                String st=helper(s);
                sb.append(st);
            }else{
                sb.append(s[i]);
                i++;
            }
        }
        return sb.toString();
    }
}