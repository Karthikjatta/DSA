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
    int sum=0;
    public void sumLeft(TreeNode node,Boolean flag){
        if(node==null) return;
        if(node.left==null&&node.right==null&&flag==true){
            sum+=node.val;
        }
        sumLeft(node.left,true);
        sumLeft(node.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root){
        sumLeft(root,false);
        return sum;
    }
}