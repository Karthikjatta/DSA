class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int l=0,r=matrix[0].length-1;
        int t=0,b=matrix.length-1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                arr.add(matrix[t][i]);
            }
            t++;
             for(int i=t;i<=b;i++){
                arr.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
             for(int i=r;i>=l;i--){
                arr.add(matrix[b][i]);
            }
            b--;
            }
            if(l<=r){
             for(int i=b;i>=t;i--){
                arr.add(matrix[i][l]);
            }
            l++;
            }
        }
        return arr;
    }
}