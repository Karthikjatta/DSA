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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Deque<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean rev=false;
        while(!q.isEmpty()){
            int level=q.size();
            LinkedList<Integer> currlev=new LinkedList<>();
            for(int i=0;i<level;i++){
                if(!rev){
                    TreeNode curr=q.pollFirst();
                    currlev.add(curr.val);
                    if(curr.left!=null) q.addLast(curr.left);
                    if(curr.right!=null) q.addLast(curr.right);
                }else{
                    TreeNode curr=q.pollLast();
                    currlev.add(curr.val);
                    if(curr.right!=null) q.addFirst(curr.right);
                    if(curr.left!=null) q.addFirst(curr.left);
                }

            }
            rev=!rev;
            res.add(new ArrayList(currlev));
        }
        return res;
    }
}