class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int i=0;
        int sum=0;
        int count=0;
        while(i<nums.length){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0) rem=k+rem;
            if(mp.containsKey(rem)){
                count+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
            i++;
        }
        return count;
    }
}