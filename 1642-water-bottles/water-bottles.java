class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles>numExchange){
            int left=numBottles%numExchange;
            count+=numBottles/numExchange;
            numBottles=numBottles/numExchange+left;
        }
        return count+numBottles/numExchange;
    }
}