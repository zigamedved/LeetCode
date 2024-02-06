class Solution {
    public int repeatedNTimes(int[] A) {
        int count=0;
        int target=A.length/2;
        
        for(int i = 0; i<A.length;i++){
            for(int j = 0; j<A.length; j++){
                if(A[i]==A[j]){
                    count++;
                }
            }
            if(count==target){
                return A[i];
            }
            count=0;
        }
        return 42;
    }
}