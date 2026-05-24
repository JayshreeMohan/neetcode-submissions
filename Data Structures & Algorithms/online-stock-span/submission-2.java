class StockSpanner {

    Stack<int []>stack;

    public StockSpanner() {
        stack = new Stack();
    }
    
    public int next(int price) {

        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){ //stack me ek ek pair ko daal k compare kr rhe  hain
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