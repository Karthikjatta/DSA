class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length/3;
        int ans[][] =new int[n][3];
        int ind=0;
        for(int i=0;i<nums.length;i+=3){
            int a=nums[i],b=nums[i+1], c=nums[i+2];
            if(c-a<=k){
                ans[ind++]=new int[]{a,b,c};
            }
            else return new int[0][0];
        }
        return ans;
    }
}