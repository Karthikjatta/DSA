class Solution {
      public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }
public void rotate(int[] nums, int k) {
      k=k%nums.length;
      if(k<0) {
         k=k*-1;
          k=nums.length-k;
      }
      reverse(nums,0,nums.length-k-1);
      reverse(nums,nums.length-k,nums.length-1);
      reverse(nums,0,nums.length-1);
    }
}