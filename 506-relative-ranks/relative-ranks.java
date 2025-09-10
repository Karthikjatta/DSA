class Solution {
    public static int findInd(int[] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val) return i;
        }
        return 0;
    }
    public String[] findRelativeRanks(int[] score) {
        int temp[]=new int[score.length];
        temp=Arrays.copyOf(score,score.length);
        Arrays.sort(temp);
        int count=0;
        String ans[]=new String[temp.length];
        for(int i=temp.length-1;i>=0;i--){
            int ind=findInd(score,temp[i]);
            if(count==0){
             ans[ind]="Gold Medal";
            }
            else if(count==1){
             ans[ind]="Silver Medal";
            }
            else if(count==2){
             ans[ind]="Bronze Medal";
            }
            else{
                ans[ind]=(count+1)+"";
            }
            count++;
        }
        return ans;
    }
}
