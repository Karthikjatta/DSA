class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int len=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                len=Math.max(len,st.size());
                st.pop();
            }
            else if(ch=='(') st.push(ch);
            else{
                continue;
            }
        }
        return len;
    }
}