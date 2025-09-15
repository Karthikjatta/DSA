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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q=new LinkedList<>();
        q.offer(new pair(root,0));
        int maxlen=0;
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().num;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.peek().node;
                int curr_id=q.peek().num-min;
                q.poll();
                if(i==0) first=curr_id;
                if(i==size-1) last=curr_id;
                if(curr.left!=null) q.offer(new pair(curr.left,curr_id*2+1));  
                if(curr.right!=null) q.offer(new pair(curr.right,curr_id*2+2));
            }
            maxlen=Math.max(maxlen,last-first+1);
        }
        return maxlen;
    }
}
class pair{
    int num;
    TreeNode node;
    pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
}