//110
//https://leetcode.com/problems/balanced-binary-tree/description/
//16.8.24

package Trees;

// Given a binary tree, determine if it is 
// height-balanced
// .

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: true
// Example 2:


// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
// Example 3:

// Input: root = []
// Output: true
 

// Constraints:

// The number of nodes in the tree is in the range [0, 5000].
// -104 <= Node.val <= 104

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
    public int Height(TreeNode root){
        if(root==null) return 0;
        int left_tree=Height(root.left);
        int right_tree=Height(root.right);
        if(left_tree==-1 || right_tree==-1) return -1;
        if(Math.abs(left_tree-right_tree)>1) return -1;
        return Math.max(left_tree,right_tree)+1;

        

    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Height(root)==-1) return false;
        return true;
        
        

        
    }
}
