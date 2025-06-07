class Solution {
    public int distance(int[] point){
        return point[0]*point[0]+point[1]*point[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p=new PriorityQueue<>((a,b)->distance(b)-distance(a));
        for(int[] point:points){
            p.offer(point);
            if(p.size()>k){
                p.poll();
            }
        }
        int[][] ans=new int[k][2];
        int i=0;
        for(int[] point:p){
            ans[i++]=point;
        }
        return ans;
    }
}