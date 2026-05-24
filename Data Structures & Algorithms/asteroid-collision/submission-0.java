class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<Integer>();
        for(int asteroid: asteroids){
            while(!st.isEmpty() && asteroid < 0 && st.peek()>0){ //exploison only in case of opposite directions

            //the big one will explode
                int popped = st.pop();
                if(Math.abs(popped) > Math.abs(asteroid)){
                    st.push(popped);
                    asteroid = 0;
                    break;
                }

                else if(Math.abs(popped) == Math.abs(asteroid)){
                    asteroid = 0;
                    break;
                }
                //the else condition will only pop element from st whivh is done in global scope
            }

            //if asteroid does not explode then add it in stack
            if(asteroid!=0){
                st.push(asteroid);
            }


        }

//converting stack into array
        int[] result = new int[st.size()];
        for(int i = st.size()-1;i>=0;i--){
            result[i] = st.pop();
        }
        return result;
    }
}