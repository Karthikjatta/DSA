class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix =new int[n][n];
         int l=0,r=matrix[0].length-1;
        int t=0,b=matrix.length-1;
        int a=1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                matrix[t][i]=a++;
            }
            t++;
             for(int i=t;i<=b;i++){
                matrix[i][r]=a++;
            }
            r--;
            if(t<=b){
             for(int i=r;i>=l;i--){
               matrix[b][i]=a++;
            }
            b--;
            }
            if(l<=r){
             for(int i=b;i>=t;i--){
               matrix[i][l]=a++;
            }
            l++;
            }
        }
        return matrix;
    }
}