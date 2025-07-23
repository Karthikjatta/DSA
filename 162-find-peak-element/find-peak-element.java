class Solution {
    public int findPeakElement(int[] nums) {
        int l=1;
        int r=nums.length-2;
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[r]) return nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return 0;
    }
}