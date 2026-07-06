class Solution {
    public int numIslands(char[][] grid) {
        int rows= grid.length;
        int cols=grid[0].length;

        int islands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }

            }
        }
        return islands;

    }
    private void dfs(char[][] grid,int i,int j){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] == '0')
            return;

             grid[i][j] = '0';

             dfs(grid, i + 1, j); // down
             dfs(grid, i - 1, j); // up
             dfs(grid, i, j + 1); // right
            dfs(grid, i, j - 1); // left
    }
}