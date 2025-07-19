class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        int[] visited=new int[nums2.length];
        Arrays.fill(visited,0);
        int[] ans=new int[nums1.length];
        int x=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(visited[j]!=1&&nums1[i]==nums2[j]){
                    ans[x++]=nums1[i];
                    visited[j]=1;
                  break;
                }
            }
        }
        return Arrays.copyOfRange(ans, 0, x);
    }
}