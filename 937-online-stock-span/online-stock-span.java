class StockSpanner {
    Stack<int[]> stack;
    int ind;

    public StockSpanner() {
        stack=new Stack<>();
        ind=-1;
    }
    
    public int next(int price) {
        ind=ind+1;
        while(!stack.isEmpty() && stack.peek()[0]<=price)
        {
            stack.pop();
        }
        int val=ind-(stack.isEmpty()?-1:stack.peek()[1]);
        stack.push(new int[]{price,ind});
        return val;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */