brute-force
-----------------------------------------------------------
class Solution {
    public int[][] rotate(int[][] matrix){
        int n = matrix.length;
        int [][] rotated = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        return rotated
    }
}
T.C = O(n^2)
S.C = O(n^2)
--------------------------------------------------------------
optimal

Transpose original -> reverse rows

class Solution {
    public void rotate(int[][] matrix){
        int n = matrix.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
        
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

T.C = O(n^2)
S.C = O(1)
---------------------------------------------------------------

Bonus: (Anti-clock wise)
Transpose original -> reverse columns


reversing logic 

for (int j = 0; j < n; j++) {
    int top = 0;
    int bottom = n - 1;

    while (top < bottom) {
        int temp = matrix[top][j];
        matrix[top][j] = matrix[bottom][j];
        matrix[bottom][j] = temp;

        top++;
        bottom--;
    }
}