class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        long sum=0;
        long maxSum=0;
        int j=0;
        int i=0;
        for(i=0;i<k;i++){
            sum+=nums[i];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        if(mp.size()==k){
            maxSum=sum;
        }
        while(i<nums.length){
            sum-=nums[j];
            mp.put(nums[j],mp.getOrDefault(nums[j],0)-1);
            if(mp.get(nums[j])==0) mp.remove(nums[j]);
            j++;
           if(i<nums.length){sum+=nums[i];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        if(mp.size()==k){
            maxSum=Math.max(maxSum,sum);
        }
        }
            i++;
        }
        return maxSum;
    }
}