class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int i=0;
        int sum=0;
        int maxlen=0;
        while(i<nums.length){
            if(nums[i]==0) sum-=1;
            else sum+=1;
            if(mp.containsKey(sum)){
                maxlen=Math.max(maxlen,i-mp.get(sum));
            }
            else
                mp.put(sum,i);
            
            i++;
        }
        return maxlen;
    }
}