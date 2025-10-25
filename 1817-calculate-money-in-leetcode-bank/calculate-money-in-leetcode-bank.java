class Solution {
    public int totalMoney(int n) {
        int money=0;
        int times=n/7;
        int day=0;
        for(int i=1;i<=times+1;i++){
            for(int j=0;j<7;j++){
                money+=i+j;
                day++;
                if(day==n) return money;
            }
        }
        return money;
    }
}