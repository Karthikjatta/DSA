class Solution {
    public int findComplement(int num) {
        int x=num;
        int digits=0;
        while(num>1){
            digits++;
            num/=2;
        }
        int mask=(1<<(digits+1))-1;
        return x^mask;
    }
}