//424
//2.6.24
//Need to be revised looked like a hell and not properly understood the maxfreq part getting subtracted from len tht is right-left+1
//https://leetcode.com/problems/longest-repeating-character-replacement/description/

// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

// Example 1:

// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.
// Example 2:

// Input: s = "AABABBA", k = 1
// Output: 4
// Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
// The substring "BBBB" has the longest repeating letters, which is 4.
// There may exists other ways to achieve this answer too.
 

// Constraints:

// 1 <= s.length <= 105
// s consists of only uppercase English letters.
// 0 <= k <= s.length


class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26]; // Frequency array for characters 'A' to 'Z'
        int maxLength = 0; // Result to store the maximum length of valid substring
        int maxFreq = 0; // The maximum frequency of a single character in the current window
        int left = 0; // Left pointer of the sliding window

        // Traverse the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            charCount[currentChar - 'A']++; // Update the frequency of the current character
            maxFreq = Math.max(maxFreq, charCount[currentChar - 'A']); // Update the max frequency in the current window

            // Calculate the current window size
            int currentWindowSize = right - left + 1;

            // If the window is not valid, shrink it from the left
            if (currentWindowSize - maxFreq > k) {
                charCount[s.charAt(left) - 'A']--; // Reduce the frequency of the left character
                left++; // Move the left pointer to the right
            }

            // Update the maximum length of the valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength; // Return the maximum length found
    }
}
