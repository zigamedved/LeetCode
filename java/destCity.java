class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String first,second;
        int count;
        for (int i = 0; i < paths.size(); i++) {
            first=paths.get(i).get(0);
            second=paths.get(i).get(1);
            if(map.get(first)==null){
                map.put(first,1);
            }else{
                count = map.get(first);
                map.put(first,count+1);
            }
            if(map.get(second)==null){
                map.put(second,0);
            }
        }
        for (String i : map.keySet()) {
            if(map.get(i)==0)return i;
        }
        return null;
    }
}