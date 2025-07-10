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
    public void flatten(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null){
            TreeNode temp=curr;
            if(temp.left!=null){
                temp=temp.left;
            while(temp.right!=null){
                temp=temp.right;
            }
            temp.right=curr.right;
            curr.right=curr.left;
            curr.left=null;
        }
            curr=curr.right;
        }
        
    }
}