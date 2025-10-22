class Solution {
    public int rob(int[] nums) {
        // int[] dp=new int[nums.length+1];
        // dp[0]=nums[0];
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int take=nums[i];
            if(i>1) take+=prev2;
            int nottake=prev1;
            int curr=Math.max(take,nottake);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}