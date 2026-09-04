class Solution {

    public int findMedian(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }

        int req = (n * m) / 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                count += upperBound(matrix[i], mid);
            }
            if (count <= req) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }
    public int upperBound(int[] row, int target) {

        int low = 0;
        int high = row.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (row[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

Time: O(n log m log(maxValue - minValue))
Space: O(1)