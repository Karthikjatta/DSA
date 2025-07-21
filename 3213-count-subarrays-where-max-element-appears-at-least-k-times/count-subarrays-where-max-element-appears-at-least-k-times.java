class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=0;
        int r=0;
        int max=0;
        long cnt=0;
        int freq=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        while(r<nums.length){
            if(nums[r]==max){
                freq++;
            }
            while(freq==k){
                cnt=cnt+(nums.length-r);
                if(nums[l]==max) freq--;
                l++;
            }
            r++;
        }
        return cnt;
    }
}