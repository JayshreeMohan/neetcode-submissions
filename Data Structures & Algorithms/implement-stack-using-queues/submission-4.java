class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {

        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        
    }
    
    public void push(int x) {

        //first we will add in q2, while q1 is not empty we will pt all items of q1 in q2
        //then we will swap q1 and q2
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        //to put all things again in q1
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        
    }
    
    public int pop() {
       return q1.poll();
        
    }
    
    public int top() {
        return q1.peek();
        
    }
    
    public boolean empty() {
       return q1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */