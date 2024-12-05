//125
//https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
//5.12.24

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.


package Arrays;

class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replace(":", "");
        s1 = s1.toLowerCase();
        
        String sp[] = { ":", ",", " ", ".", "@", "!", "#", "%", "^", "&", "*", "(", ")", "-", "/", "_", "|", "\\", "'","{", "}", "[", "]", "\"", "?", ";", ">", "<", "~", "`" };

        for (String special : sp) {
            s1 = s1.replace(special, "");
        }
        int i = 0, j = s1.length() - 1;
        while (i < j) {
            if (s1.charAt(i) == s1.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

    }
}

