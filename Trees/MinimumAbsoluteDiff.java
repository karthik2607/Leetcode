//530
//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
//26.12.24

// Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

 

// Example 1:


// Input: root = [4,2,6,1,3]
// Output: 1
// Example 2:


// Input: root = [1,0,48,null,null,12,49]
// Output: 1
 

// Constraints:

// The number of nodes in the tree is in the range [2, 104].
// 0 <= Node.val <= 105

package Trees;

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
    public int getMinimumDifference(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            res.add(node.val);
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);

        }

        int i=0;
        int j=1;
        int min=Integer.MAX_VALUE;
        while(i<res.size() && j<res.size()){
            min=Math.min(min,Math.abs(res.get(i)-res.get(j)));
            if(j==res.size()-1){
                i++;
                j=i+1;
            }else{
            j++;
            }
            
        }
        return min;
        
    }
}

