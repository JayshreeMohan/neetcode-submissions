class StockSpanner {

    //we will consider a pair for stock and span, the array will contain price and then span
    //initially the span will be 1 because every eleemnet will be equal to itself

    Stack<int []>stack;

    public StockSpanner() {
        stack = new Stack<>();
        
    }
    
    public int next(int price) {

        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span+=stack.pop()[1];
        }
        stack.push(new int[]{price,span});
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */