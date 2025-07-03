class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int s=0;
        int end=k;
        for(int i=0;i<end;i++){
            sum+=nums[i];
        }
        double ans=sum/k;
        while(end<nums.length){
            s++;
            end++;
            sum=sum-nums[s-1];
           sum=sum+nums[end-1];
            ans=Math.max(ans,sum/k);
        }
        return ans;
    }
}