class Solution {
    public void heapify(int []arr,int n,int i){
        int largest=i;
        int r=2*i+2;
        int l=2*i+1;
        if(l<n&&arr[l]>arr[largest]) largest=l;
        if(r<n && arr[r]>arr[largest]  ) largest=r;
        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,n,largest);
        }
    }
    public int[] sortArray(int[] nums) {
        for(int i=nums.length/2-1;i>=0;i--){
            heapify(nums,nums.length,i);
        }
        for(int i=nums.length-1;i>=0;i--){
            int temp=nums[i];
            nums[i]=nums[0];
            nums[0]=temp;
            heapify(nums,i,0);
        }
        return nums;
    }
}