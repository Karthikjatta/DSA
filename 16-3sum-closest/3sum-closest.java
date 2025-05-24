class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<=diff){
                    ans=sum;
                    diff=Math.abs(sum-target);
                }
                if(sum<target)
                j++;
                else
                k--;
            }
        }
        return ans;
    }
}