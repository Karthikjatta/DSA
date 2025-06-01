class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int j=0;
        int sum=0;
        for(int i=cost.length-1;i>=0;i--){
            j++;
            if(j%3==0){
                continue;
            }
            sum+=cost[i];
        }
        return sum;
    }
}