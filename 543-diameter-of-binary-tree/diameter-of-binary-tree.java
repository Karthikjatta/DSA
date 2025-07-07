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
     int diameter=0;
    public int Height(TreeNode node){
        if(node==null) return 0;
        int left=Height(node.left);
        int right=Height(node.right);
        diameter=Math.max(left+right+1,diameter);
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
       Height(root);
        return diameter-1;
    }

}