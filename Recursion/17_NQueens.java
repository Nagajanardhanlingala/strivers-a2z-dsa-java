class Solution {
    public void nQueens(char[][] board, int row,int n, List<List<String>> result){
        if(row == n){
            List<String> current = new ArrayList<>();
            for(int i=0;i<n;i++){
                current.add(new String(board[i]));
            }
            result.add(current);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j,n)){
                board[row][j] = 'Q';
                nQueens(board,row+1,n,result);
                board[row][j]='.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col, int n){
        // horizontal
        for(int j=0;j<n;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i=0;i<n;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //left diagonal
        for(int i= row, j=col;i>= 0 && j >= 0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //right diagonal
        for(int i=row,j=col; i>=0 && j<n;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) { 
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> result = new ArrayList<>();
        nQueens(board,0,n,result);
        return result;
    }
}