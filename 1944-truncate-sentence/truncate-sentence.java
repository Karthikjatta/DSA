class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
            ans+=str[i];
            ans+=" ";
        }
        return ans.trim();
    }
}