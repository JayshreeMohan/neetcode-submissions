class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int res = 0;

        for(String op : operations){
            if(op.equals("+")){
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            }
            else if(op.equals("D")){
                int top = st.peek();
                int newScore = 2 * top;
                st.push(newScore);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }

        for(int i : st){
            res += i;
        }
        return res;
        
    }
}