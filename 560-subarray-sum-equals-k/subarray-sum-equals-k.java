class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum-k;
            if(mp.containsKey(rem)){
                count+=mp.get(rem);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}