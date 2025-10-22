class Solution {
    public int helper(int nums[],int dp[],int ind,int i){
        if(ind<i) return 0;
        if(ind==i) return nums[ind];
        if(dp[ind]!=-1) return dp[ind];
        int take=nums[ind]+helper(nums,dp,ind-2,i);  
        int notTake=helper(nums,dp,ind-1,i);  
        return dp[ind]=Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int case1=helper(nums,dp,nums.length-2,0);
        Arrays.fill(dp,-1);
        int case2=helper(nums,dp,nums.length-1,1);
        return Math.max(case1,case2);
    }
}