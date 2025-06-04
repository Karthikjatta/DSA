class Solution {
    public boolean checkstring(int i,String h,String n){
        int x=0;
        while(x<n.length()){
            if(i >= h.length()||h.charAt(i)!=n.charAt(x)){
                return false;
            }
            i++;
            x++;
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        char x=needle.charAt(0);
        if(haystack.length()<needle.length()) return -1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==x){
                boolean res=checkstring(i,haystack,needle);
                if(res==true){
                    return i;
                }
            }
        }
        return -1;
    }
}