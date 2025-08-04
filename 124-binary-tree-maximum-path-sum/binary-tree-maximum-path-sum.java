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
    public int pathSum(TreeNode node,int[] arr){
        if(node==null) return 0;
        int left=Math.max(0,pathSum(node.left,arr));
        int right=Math.max(0,pathSum(node.right,arr));
        arr[0]=Math.max(arr[0],node.val+right+left);
        return node.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int[] arr=new int[1];
        arr[0] =Integer.MIN_VALUE;
      pathSum(root,arr);
      return arr[0];
    }
}