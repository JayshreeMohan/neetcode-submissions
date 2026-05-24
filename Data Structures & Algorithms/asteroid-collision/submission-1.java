class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        //the basis of astroid collision is that we will consider collision when upcoming is negative and top is positive. and also bigger one will get collided

        Stack<Integer> st = new Stack<>();
        for(int asteroid : asteroids){
            //handling collision scenario
            while(!st.isEmpty() && asteroid < 0 && st.peek() > 0){
                //instead of calculating each we can put the whole logic to net difference part
                int diff = asteroid + st.peek();
                if(diff < 0){
                    st.pop();
                }
                else if(diff > 0){
                    asteroid = 0;
                }
                else{
                    asteroid = 0;
                    st.pop();
                }
            }
            if(asteroid != 0){
                st.add(asteroid); //survivor asteriod should be added to stack
            }

            }

            int[]ans = new int[st.size()];
            for(int i = 0; i < st.size(); i++){
                ans[i] = st.get(i);
            }
            return ans;
        }
        
    }
