class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(count==0){
                    count++;
                }
                else{
                   count++;
                    ans+=c;
                }
            }
            else{
                if(count==1){
                   count--;
                }
                else{
                    count--;
                    ans+=c;
                }
            }
    }
            return ans;
    }
}