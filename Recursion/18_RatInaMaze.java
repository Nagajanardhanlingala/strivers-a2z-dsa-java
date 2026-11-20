class Main {
    public void helper(int[][] grid, int r, int c, List<String> ans, String path,boolean[][] visited){
        int n = grid.length;
        
        if(r < 0 || c < 0 || r >= n || c >= n || grid[r][c] == 0 || visited[r][c]){   //base case 1
            return;
        }
        
        if(r == n-1 && c == n-1){   //base case 2
            ans.add(path);
            return;
        }
        
        visited[r][c] = true;
        
        helper(grid,r+1,c,ans,path + "D",visited);  //down
        helper(grid,r-1,c,ans,path + "U",visited);  //up
        helper(grid,r,c-1,ans,path + "L",visited);  //left
        helper(grid,r,c+1,ans,path + "R",visited);  //right
        
        visited[r][c] = false;      //backtracking step
    }
    public List<String> findPath(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        List<String> ans = new ArrayList<>();
        String path ="";
        
        helper(grid,0,0,ans,path,visited);
        return ans;
    }
}