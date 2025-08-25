class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0;
        int count=0;
        int maxlen=0;
        while(r<nums.length){
            if(nums[r]==0) count++;
            if(count>1){
                while(count>1) {
                    if(l<r && nums[l]==0){
                        count--;
                    }
                    l++;
                }
            }
            maxlen = Math.max(maxlen, r - l);
            r++;
        }
        return maxlen;
    }
}