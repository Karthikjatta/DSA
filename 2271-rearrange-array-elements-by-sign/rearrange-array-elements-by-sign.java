class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans =new int[nums.length];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[2*p]=nums[i];
                p++;
            }
            else{
                ans[2*n+1]=nums[i];
                n++;
            }
        }
        return ans;
    }
}