class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxSum=sum;
        int left=k-1;
        int right=cardPoints.length-1;
        while(left>=0){
            sum-=cardPoints[left];
            left--;
            sum+=cardPoints[right];
            right--;
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}