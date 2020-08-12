class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        if(rowIndex==0){
            return row;
        }
        all.add(row);
       for(int i = 1; i<=rowIndex;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            List<Integer> prev = all.get(i-1);
            int el;
            for(int j = 1; j<i; j++){
                el=prev.get(j-1)+prev.get(j);
                curr.add(el);
            }
            curr.add(1);
            all.add(curr);
        }
        return all.get(rowIndex);
    }
}