class StockSpanner {
    // we will use pair to solve this, the pair will be like {price,span}
    //new way to write pair
    Stack<int []> st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;

        while(!st.isEmpty() && st.peek()[0] <= price){
            span += st.pop()[1];
        }
        st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */