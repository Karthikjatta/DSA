class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String fa="";
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==' '){
                fa+=a+" "; 
                a="";
                while(s.charAt(i-1)==' ') i--;
            }
            else{
                a=c+a;
            }
        }
        fa+=a;
        return fa;
    }
}
