class Solution {
    public int isPresent(char c,String s,int j){
        for(int i=j;i<s.length();i++){
            if(s.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<s.length();i++){
        int x=isPresent(s.charAt(i),t,j);
         if(x==-1) return false;
         j=x+1;
        }
        return true;
    }
}