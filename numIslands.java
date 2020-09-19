class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    recursion(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void recursion(char[][] grid,int i , int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0')return;
        grid[i][j]='0';
        recursion(grid,i+1,j);
        recursion(grid,i,j-1);
        recursion(grid,i-1,j);
        recursion(grid,i,j+1);
    }
}
