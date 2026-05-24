class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //the whole concept of collision is based on the assumption that
        // we will consider collision if the coming asteriod is negative and peek is positive 
        //because if its positive, its already in stack
        //also we can consider diff for net difference

        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            while(!st.isEmpty() && a < 0 && st.peek() > 0){
                int diff = a + st.peek();
                if(diff < 0){
                    st.pop();
                }
                else if(diff > 0){
                    a = 0;
                }
                else{
                    st.pop();
                    a = 0;
                }
            }
            if(a != 0){
                st.add(a);
            }
        }
        int[]ans = new int [st.size()];
        for(int i = 0; i < st.size(); i++){
            ans[i] = (st.get(i));
        }
        return ans;
        
    }
}