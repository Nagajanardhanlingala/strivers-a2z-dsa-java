class Solution {

    public boolean isSafe(char[][] board,int row, int col, char digit){
        //horizontal check
        for(int j=0;j<9;j++){
            if(board[row][j] == digit){
                return false;
            }
        }

        //vertical check
        for(int i=0;i<9;i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        //3 X 3 grid check
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        for(int i=startRow;i<=startRow+2;i++){
            for(int j=startCol;j<=startCol+2;j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row, int col){

        if(row == 9){          //base case
            return true;
        }
        int nextRow = row, nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(board[row][col] != '.'){          //check if we are starting with any number
            return helper(board,nextRow,nextCol);
        }

        for(char digit = '1';digit <= '9';digit++){    //place any number from 1 to 9
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;
                if(helper(board,nextRow,nextCol)){
                    return true;
                }
                board[row][col] = '.';     //backtrack
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}