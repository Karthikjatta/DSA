class Solution {
    public int maximumDifference(int[] nums) {
        int prev=nums[0];
        int max=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>prev){
                max=Math.max(max,nums[i]-prev);
            }
            else{
                prev=nums[i];
            }
        }
        return max;
    }
}