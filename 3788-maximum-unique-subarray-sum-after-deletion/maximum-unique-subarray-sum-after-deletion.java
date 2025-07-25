class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]>0)
            s.add(nums[i]);
        }
        int sum=0;
        for(int i:s){
            sum+=i;
        }
        if(max<0) return max;
        return sum;
    }
}