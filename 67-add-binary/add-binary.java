class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        int i=a.length()-1;
        String ans="";
        int j=b.length()-1;
        while(i>=0||j>=0){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';
            int bit =sum%2;
            ans=bit+ans;
            carry=sum/2;
            i--;
            j--;
        }
        if(carry>0) ans='1'+ans;
        return ans;
    }
}