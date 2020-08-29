class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[] cur = new int[A.length];
        
        for(int i = 0; i<A.length; i++){
            int id=0;
            int num=0;
            for(int j = A[i].length-1; j>=0; j--){
                num=A[i][j];
                if(num==1){
                    num=0;
                }else num=1;
                cur[id]=num;
                id++;
            }
            for(int k = 0; k<cur.length; k++){
                A[i][k]=cur[k];
                //System.out.print(cur[k]);
            }
            //System.out.println();
        }
        return A;
    }
}