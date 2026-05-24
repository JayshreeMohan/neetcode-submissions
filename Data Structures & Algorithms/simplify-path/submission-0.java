class Solution {
    public String simplifyPath(String path) {
        // in unix system .. means going to the parent directory and . means staying in the current directory

        String[] paths = path.split("/");
        Stack<String> st = new Stack<>();

        for(String p : paths){
            if(p.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(!p.equals("") && !p.equals(".")){ // we are doing not path.equals beacuse if we are on . then we have to remain in the same directory and not have to push it or pop it
                st.push(p);
            }
        }
        return "/" + String.join("/",st);

        
    }
}