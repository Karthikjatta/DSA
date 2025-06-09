class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        int x=0;
        PriorityQueue<int[]> p=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<nums.length;i++){
            p.offer(new int[]{nums[i],i});
            while(p.peek()[1]<=i-k){
                p.poll();
            }
            if(i>=k-1){
                ans[x]=p.peek()[0];
                x++;
            }
        }
        // int[] ans=new int[list.size()];
        // int x=0;
        // for(int i:list){
        //     ans[x]=i;
        //     x++;
        // }
        return ans;
    }
}