class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer>st = new Stack<>();
        for(String op:operations){

            //for previous two scores
            if(op.equals("+")){
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            }
            else if(op.equals("D")){
                int lastScoreDouble = 2*st.peek();
                st.push(lastScoreDouble);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for(int i:st){
            sum+=i;
        }
        return sum;
        
    }
}