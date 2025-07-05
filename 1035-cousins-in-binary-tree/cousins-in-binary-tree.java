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
    public int node(TreeNode root,int x,int l){
        if(root==null) return 0;
        if(root.val==x) return l;
        int left=node(root.left,x,l+1);
        if(left!=0) return left;
       return node(root.right,x,l+1);
    }
    public boolean isSibling(TreeNode root, int x, int y) {
    if (root == null) return false;
    if (root.left != null && root.right != null) {
        if ((root.left.val == x && root.right.val == y) || 
            (root.left.val == y && root.right.val == x)) {
            return true;
        }
    }
    return isSibling(root.left, x, y) || isSibling(root.right, x, y);
}

    public boolean isCousins(TreeNode root, int x, int y) {
        int xx=node(root,x,0);
        int yy=node(root,y,0);
        return(
            (xx==yy)&&!isSibling(root,x,y)
        );
    }
}