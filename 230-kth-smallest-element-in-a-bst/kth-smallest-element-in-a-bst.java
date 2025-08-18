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
    public void helper(TreeNode node,ArrayList<Integer> a){
        if(node==null) return;
        helper(node.left,a);
        a.add(node.val);
        helper(node.right,a);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        helper(root,a);
        return a.get(k-1);
   }
}