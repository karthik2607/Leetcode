//1002
//5.6.24
//https://leetcode.com/problems/find-common-characters/description/?envType=daily-question&envId=2024-06-05

// Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

// Example 1:

// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]
// Example 2:

// Input: words = ["cool","lock","cook"]
// Output: ["c","o"]
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 100
// words[i] consists of lowercase English letters.



class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        
        // Loop through each character from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int minCount = Integer.MAX_VALUE;
            
            // Count occurrences of the current character in each word
            for (String word : words) {
                int count = 0;
                for (char c : word.toCharArray()) {
                    if (c == ch) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
            }
            
            // Add the character to the result list the required number of times
            for (int i = 0; i < minCount; i++) {
                result.add(String.valueOf(ch));
            }
        }
        
        return result;
    }
}
