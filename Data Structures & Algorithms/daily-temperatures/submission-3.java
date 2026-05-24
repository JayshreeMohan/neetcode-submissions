class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //for this we will store index in stack and not the actual elements, so we could calculate the 
        //number of days which will be currentIndex - previous day

        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int popped = st.pop();
                res[popped] = i - popped;
            }
            st.push(i);

        }
        return res;        
    }
}
