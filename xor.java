class Solution {
    public int xorOperation(int n, int start) {
        int[] tab = new int[n];
        int res=start;
        
        for(int i = 0; i<n; i++){
            tab[i]=start+2*i;
        }
        
        for(int j = 1; j<n; j++){
            res=res^tab[j];
        }
       
        return res;
    }
}