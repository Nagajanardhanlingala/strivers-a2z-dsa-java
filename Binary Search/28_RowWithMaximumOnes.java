class Main{
    public static int lowerBound(int[] arr,int n,int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid] >= x){
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int rowWithMax1s(int[][] matrix,int n,int m){
        int countMax=0;
        int index = -1;
        for(int i=0;i<n;i++){
            int countOnes = m-lowerBound(matrix[i],m,1);
            if(countOnes >countMax){
                countMax = countOnes;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {

    int[][] matrix = {
        {0, 0, 0, 1},
        {0, 0, 1, 1},
        {0, 1, 1, 1},
        {0, 0, 0, 0}
    };

    int n = matrix.length;
    int m = matrix[0].length;

    int result = rowWithMax1s(matrix, n, m);

    System.out.println("Row with maximum 1s: " + result);
}
}

Time: O(N log M)
Space: O(1)


O(N+M) Approach

class Main{
    public static int rowWithMax1s(int[][] matrix,int n,int m){
        int row = 0;
        int col= m-1;
        int ans = -1;
        
        while(row <n && col >= 0){
            if(matrix[row][col] == 1){
                ans = row;
                col--;
            }else{
                row++;
            }
        }
        return ans;
    }
}