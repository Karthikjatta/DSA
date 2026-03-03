class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int f=-1,la=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                f=mid;
                la=mid;
                while(f>0&&nums[f-1]==target) f--;
                while(la<nums.length-1 && nums[la+1]==target) la++;
                return new int[]{f,la};
            }
            else if(nums[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return new int[]{-1,-1};
    }
}