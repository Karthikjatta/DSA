class Solution {
    public int helper(int[] arr,int dp[],int ind){
        if(ind>=arr.length) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int one=helper(arr,dp,ind+1)+arr[ind];
        int two=helper(arr,dp,ind+2)+arr[ind];
        return dp[ind]=Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,dp,0),helper(cost,dp,1));
    }
}