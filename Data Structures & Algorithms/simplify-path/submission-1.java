class Solution {
    public String simplifyPath(String path) {
        // for finding the simplified canonical path, in unix system it is always
        // . means stay in current directory and .. means move to parent directory

        String[] paths = path.split("/");
        Stack<String> st = new Stack<>();

        for(String p : paths){
            if(p.equals("..")){
            if(!st.isEmpty()){
                st.pop();
            }
            }
            else if(!p.equals("") && !p.equals(".")){
                st.push(p);
            }
        }
        return "/" + String.join("/",st);
        
    }
}