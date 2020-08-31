class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int column=0;
        int min;
        
        for(int i = 0; i<matrix.length;i++){
            min=matrix[i][0];
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    column=j;
                    min=matrix[i][j];
                }
            }
            
            if(check(matrix,column,min)){
                    result.add(min);
            }
        }
        return result;
    }
    private boolean check(int[][] matrix,int column, int num){
        for(int i = 0; i<matrix.length;i++){
            if(matrix[i][column]>num)return false;
        }
        return true;
    }
}