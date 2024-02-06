class Solution {
    public int oddCells(int n, int m, int[][] indices) {
       
        int[][] matrix=new int[n][m];
        
        int row,column;
        
        for(int i = 0; i<indices.length; i++){
            row=indices[i][0];
            column=indices[i][1];
            fill(matrix,row,column);
        }
        
        return count(matrix);
        
    }
    public void fill(int[][] matrix, int row, int column){
        for(int i = 0; i<matrix[0].length; i++){
            matrix[row][i]++;
        }
        for(int i = 0; i<matrix.length; i++){
            matrix[i][column]++;
        }
        
    }
    
    public int count(int[][] matrix){
        int sum=0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]%2!=0)sum++;
            }
        }
        return sum;
    }
}