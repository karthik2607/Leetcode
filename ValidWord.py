#3136
#10.6.24
#https://leetcode.com/problems/valid-word/description/

# A word is considered valid if:

# It contains a minimum of 3 characters.
# It contains only digits (0-9), and English letters (uppercase and lowercase).
# It includes at least one vowel.
# It includes at least one consonant.
# You are given a string word.

# Return true if word is valid, otherwise, return false.

# Notes:

# 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
# A consonant is an English letter that is not a vowel.
 

# Example 1:

# Input: word = "234Adas"

# Output: true

# Explanation:

# This word satisfies the conditions.

# Example 2:

# Input: word = "b3"

# Output: false

# Explanation:

# The length of this word is fewer than 3, and does not have a vowel.

# Example 3:

# Input: word = "a3$e"

# Output: false

# Explanation:

# This word contains a '$' character and does not have a consonant.

 

# Constraints:

# 1 <= word.length <= 20
# word consists of English uppercase and lowercase letters, digits, '@', '#', and '$'.

class Solution:
    def isValid(self, word: str) -> bool:
        vowels='aeiou'
        vowels+=vowels.upper()
        consonants='bcdfghjklmnpqrstvwxyz'
        consonants+=consonants.upper()
        allowed=vowels+consonants+'0123456789'

        if(len(word)<3): return False
        has_vowels=False
        has_consonants=False
        for c in word:
            if c in vowels: has_vowels=True
            if c in consonants: has_consonants=True
            if c not in allowed: return False

        return has_vowels and has_consonants