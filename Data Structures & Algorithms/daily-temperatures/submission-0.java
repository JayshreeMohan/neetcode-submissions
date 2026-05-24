class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //we will use the stack to store the temperature in decreasing order if we will get any temperature which is greater than the top element
        //we got a hot day , we will pop the element from the top of the stack
        //then we will calculate the difference in the index in top and that element
        //push that element in the stack

        int n = temperatures.length;
        int[]res = new int[n];

        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){

                int popped = st.pop();
                res[popped] = i - popped;

            }
            st.push(i);
        }

        return res;
        
    }
}
