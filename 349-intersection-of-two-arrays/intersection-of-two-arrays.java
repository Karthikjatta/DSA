class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      int freq[]=new int[1001];
      int ans[]=new int[nums1.length];
      int j=0;
      for(int i=0;i<nums1.length;i++){
        freq[nums1[i]]+=1;
      }  
      for(int i=0;i<nums2.length;i++){
        if(freq[nums2[i]]>0){
            ans[j++]=nums2[i];
            freq[nums2[i]]=0;
        }
      }
      int temp[]=new int[j];
      for(int i=0;i<j;i++)
      {
        temp[i]=ans[i];
      }
      return temp;
    }
}