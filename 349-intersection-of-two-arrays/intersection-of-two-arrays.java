class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int ans[]=new int[1000];
        int x=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(x==0||(x>0 && nums1[i]!=ans[x-1])){
                ans[x++]=nums1[i];
                i++;
                j++;
                }
                else{
                    i++;
                    j++;
                }
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        int temp[]=new int[x];
        for(int k=0;k<x;k++){
            temp[k]=ans[k];
        }
        return temp;
    }
}