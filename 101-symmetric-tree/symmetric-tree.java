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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            TreeNode f=q.poll();
            TreeNode s=q.poll();
            if(f==null && s==null) continue;
            if(f==null || s==null) return false;
            if(f.val!=s.val) return false;
            q.offer(f.left);
            q.offer(s.right);
            q.offer(f.right);
            q.offer(s.left);
        }
        return true;
    }
}