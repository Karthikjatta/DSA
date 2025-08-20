class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(st.isEmpty()){
                    st.push(c);
                }
                else{
                    st.push(c);
                    ans+=c;
                }
            }
            else{
                if(st.size()==1){
                    st.pop();
                }
                else{
                    st.pop();
                    ans+=c;
                }
            }
    }
            return ans;
    }
}