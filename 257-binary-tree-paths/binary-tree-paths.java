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
    public void paths(TreeNode node,StringBuilder s,List<String> ans){
        if(node==null){
            return;
        }
        int len = s.length();
        s.append(node.val);
        if(node.left==null&&node.right==null){
            ans.add(s.toString());
        }
        else{
        s.append("->");
        paths(node.left,s,ans);
        paths(node.right,s,ans);
        }
        s.setLength(len);
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        paths(root,s,ans);
        return ans;
    }
}