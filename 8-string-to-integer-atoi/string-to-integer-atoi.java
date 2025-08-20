class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int i=0;
        boolean neg=false;
        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
            if(s.charAt(0)=='-') {
                neg=true;
            }
            i++;
        }
        long ans=0;
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            ans=ans*10+digit;
            if(neg && -ans<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(!neg && ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return neg?(int)-ans:(int) ans;
    }
}