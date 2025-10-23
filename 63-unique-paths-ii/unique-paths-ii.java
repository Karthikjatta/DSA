class Solution {
    public int helper(int[][] arr,int i,int j,int[][] dp){
        if(i==0&&j==0){
            return 1;
        }
        if(i<0||j<0) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int left=0;
        int up=0;
        if(i>0&&arr[i-1][j]!=1) {
            left=helper(arr,i-1,j,dp);
        }
        if(j>0&&arr[i][j-1]!=1) {
            up=helper(arr,i,j-1,dp);
        }
        return dp[i][j]=left+up;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int i=obstacleGrid.length;
        int j=obstacleGrid[0].length;
        if(obstacleGrid[i-1][j-1]==1) return 0;
        int dp[][]=new int[i][j];
        return helper(obstacleGrid,i-1,j-1,dp);
    }
}