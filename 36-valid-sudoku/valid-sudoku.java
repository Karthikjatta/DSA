class Solution {
    public  void transpose(char[][] matrix) {
    int n = matrix.length;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            char temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}
public boolean box(char[][] board, int startRow, int startCol) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            char c = board[startRow + i][startCol + j];
            if (c != '.') {
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.get(c) > 1) return false; 
            }
        }
    }
    return true;
}

    public boolean row(char[] arr){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='.'){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        for(int i:map.values()){
            if(i>1) return false;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        //rows
        for(int i=0;i<board.length;i++){
            if(!row(board[i])){
                return false;
            }
        }
        //col
        transpose(board);
        for(int i=0;i<board.length;i++){
            if(!row(board[i])){
                return false;
            }
        }
        transpose(board);
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!box(board,i,j)) return false;
            }
        }
        return true;
    }
}