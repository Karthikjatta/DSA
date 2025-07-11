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
    boolean helper(TreeNode p, TreeNode q){
        if(p!=null&&q!=null){
            if(p.val!=q.val) return false;
           return helper(p.left,q.left) && helper(p.right,q.right);
        }
        return (p==null && q==null);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
     return helper(p,q);
    }
}