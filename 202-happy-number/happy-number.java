class Solution {
    public boolean helper(int n,Set<Integer> seen ){
        if(n==1) return true;
        if(seen.contains(n)) return false;
        seen.add(n);
          int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return helper(sum,seen);
    }
    public boolean isHappy(int n) {
        return helper(n,new HashSet<>());
    }
}