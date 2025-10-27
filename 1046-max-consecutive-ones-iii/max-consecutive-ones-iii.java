class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0,z=0;
        int maxlen=0;
        while(j<nums.length){
            if(nums[j]==0) z++;
            if(z>k){
                while(z>k){
                    if(nums[i]==0) z--;
                    i++;
                }
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}