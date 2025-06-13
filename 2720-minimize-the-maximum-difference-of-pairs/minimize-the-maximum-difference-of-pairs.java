class Solution {
    public boolean Possible(int mid,int[] arr,int p){
        int x=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<=mid){
                x++;
                i++;
            }
        }
        if(x>=p) return true;
        else return false;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0;
        int h=nums[nums.length-1]-nums[0];
        int ans=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(Possible(mid,nums,p)){
                ans=mid;
                h=mid-1;
            }
            else
            l=mid+1;
        }
        return ans;
    }
}