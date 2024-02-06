class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        List<Integer> even=new ArrayList<Integer>();  
        List<Integer> odd=new ArrayList<Integer>();  
    
        for(int i = 0; i<A.length; i++){
            if(A[i]%2==0){
                even.add(A[i]);
            }else odd.add(A[i]);
        }
        int count = 0; 
        for(int i = 0; i<even.size();i++){
            res[count]=even.get(i);
            count++;
        }
        for(int i = 0; i<odd.size();i++){
            res[count]=odd.get(i);
            count++;
        }
        return res;
        
    }
}ity