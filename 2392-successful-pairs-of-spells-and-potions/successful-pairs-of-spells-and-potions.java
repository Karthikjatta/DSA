class Solution {
    public int findInd(int[] arr,int i,long val){
        int l=0;
        int r=arr.length-1;
        int ind=arr.length;
        while(l<=r){
            int mid=(l+r)/2;
            long suc = (long) arr[mid] * i;
            if(suc>=val){
                ind=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ind;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int ind=findInd(potions,spells[i],success);
            ans[i]=potions.length-ind;
        }
        return ans;
    }
}