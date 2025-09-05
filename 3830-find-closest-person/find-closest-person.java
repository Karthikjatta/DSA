class Solution {
    public int findClosest(int x, int y, int z) {
        int x1=Math.abs(x-z);
        int y1=Math.abs(y-z);
        if(x1==y1) return 0;
        else if(x1>y1) return 2;
        else return 1;
    }
}