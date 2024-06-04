//846
//4.6.24
//https://leetcode.com/problems/hand-of-straights/description/

// Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.

// Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.

 

// Example 1:

// Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
// Output: true
// Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
// Example 2:

// Input: hand = [1,2,3,4,5], groupSize = 4
// Output: false
// Explanation: Alice's hand can not be rearranged into groups of 4.

 

// Constraints:

// 1 <= hand.length <= 104
// 0 <= hand[i] <= 109
// 1 <= groupSize <= hand.length


import java.util.*;
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        if(hand.length%groupSize != 0) return false;
        for(int i=0;i<hand.length;i++){
            minHeap.offer(hand[i]);
        }
        
        while(!minHeap.isEmpty()){
            int val=minHeap.peek();
            for(int i=val;i<val+groupSize;i++){
                if(!minHeap.remove(i)) return false;
            }
        }
        return true;
    }
}
    