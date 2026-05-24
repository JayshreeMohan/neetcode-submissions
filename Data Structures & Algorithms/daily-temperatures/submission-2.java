class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // in this we won't store elements in the stack , we will store indices.
        //if we store indices then we will get to know through current - prev that
        // for each index how many warmer days were there

        int n = temperatures.length;
        int []res = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){ // we have to do this temperatures[st.peek()] beacuse at st.peek, we are storing index and not elements
                int popped = st.pop();
                res[popped]  = i - popped;
            }
            st.push(i);
        }

        return res;
        
    }
}
