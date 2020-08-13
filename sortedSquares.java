class Solution {
    public int[] sortedSquares(int[] A) {
        List<Integer> tab = new ArrayList<>();
        int[] res = new int[A.length];
        for(int i = 0; i<A.length; i++){
            tab.add(A[i]*A[i]);
        }
        Collections.sort(tab);
        for(int i = 0; i<A.length;i++){
            res[i]=tab.get(i);    
        }
        return res;
    }
}