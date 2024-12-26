//501
//https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
//26.12.24

// Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.
// If the tree has more than one mode, return them in any order.
// Assume a BST is defined as follows:
// The left subtree of a node contains only nodes with keys less than or equal to the node's key.
// The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
// Both the left and right subtrees must also be binary search trees.
// Example 1:


// Input: root = [1,null,2,2]
// Output: [2]
// Example 2:

// Input: root = [0]
// Output: [0]
 

// Constraints:

// The number of nodes in the tree is in the range [1, 104].
// -105 <= Node.val <= 105
 

// Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).


package Trees;
import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer>hmap=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(hmap.containsKey(node.val)){
                hmap.put(node.val,hmap.get(node.val)+1);
            }else{
                hmap.put(node.val,1);
            }
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
        
        int maxCount=0;
        for(int count:hmap.values()){
            maxCount=Math.max(maxCount,count);
        }
        List<Integer>modes=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:hmap.entrySet()){
            if(entry.getValue()==maxCount){
                modes.add(entry.getKey());
                            
            }

        }

        return modes.stream().mapToInt(i->i).toArray();
    }
}


