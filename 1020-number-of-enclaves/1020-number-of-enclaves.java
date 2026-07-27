class Solution {
    public int numEnclaves(int[][] grid) {

        int m = grid.length;
        int n =  grid[0].length;
        for(int i =0;i<m ;i++){
            dfs(grid, i,0);
            dfs(grid, i, n-1);
    }
    for(int i=0;i<n;i++){
        dfs(grid, 0, i);
        dfs(grid, m-1, i);
    }
    int count =0;
    for(int i =0; i<m;i++){
        for(int j =0; j<n;j++){
        if(grid[i][j] == 1){
            count++;
        }
    }
    }
    return count;
        
    }
    public void dfs(int[][] grid, int row,int col){
        if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col] ==1 ){
            grid[row][col]=0;

            dfs(grid, row+1,col);
            dfs(grid,row-1,col);
            dfs(grid,row, col-1);
            dfs(grid, row, col+1);
        }
    }
}