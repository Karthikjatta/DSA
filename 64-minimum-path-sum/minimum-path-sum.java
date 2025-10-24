class Solution {
    public int helper(int[][] arr,int i,int j,int[][] dp){
        if(i==0&&j==0){
            return arr[0][0];
        }
        if(i<0||j<0) return Integer.MAX_VALUE;
        int up=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(dp[i][j]!=0) return dp[i][j];
        if(i>0){
            up=arr[i][j]+helper(arr,i-1,j,dp);
        }
        if(j>0){
            left=arr[i][j]+helper(arr,i,j-1,dp);
        }
        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        return helper(grid,grid.length-1,grid[0].length-1,dp);
    }
}