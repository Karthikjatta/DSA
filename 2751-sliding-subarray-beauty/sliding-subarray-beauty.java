class Solution {
    public int findXth(TreeMap<Integer, Integer> map, int x) {
            int count=0;
        for(int i:map.keySet()){
            count+=map.get(i);
            if(count>=x) return i;
        }
        return 0;
    }
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        int[] ans=new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            if(nums[i]<0)mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        int j=k;
        while(j<nums.length){
            ans[i]=findXth(mp,x);
            if(nums[i]<0){
                mp.put(nums[i],mp.get(nums[i])-1);
                if(mp.get(nums[i])==0) mp.remove(nums[i]);
            }
            if(nums[j]<0){
                mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            }
            i++;
            j++;
        }
        ans[ans.length-1]=findXth(mp,x);
        return ans;
    }
}