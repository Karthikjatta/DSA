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
    public static boolean unival(TreeNode node,int key){
        if(node==null) return true;
        if(node.val!=key) return false;
      return  unival(node.left,key) && unival(node.right,key);
    }
    public boolean isUnivalTree(TreeNode root) {
        return unival(root,root.val);
    }
}