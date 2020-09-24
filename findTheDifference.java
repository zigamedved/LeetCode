class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        
        char curr;
        int value;
        for(int i = 0; i<t.length();i++){
            curr=t.charAt(i);
            if(chars.get(curr)==null){
                chars.put(curr,1);
            }else{
                value=chars.get(curr);
                chars.put(curr,value+1);
            }
        }
        for(int i = 0; i<s.length();i++){
            curr=s.charAt(i);
            value=chars.get(curr);
            if(value==1){
                chars.remove(curr);
            }else{
                chars.put(curr,value-1);
            }
        }
        for(Character c : chars.keySet()){
            return c;
        }
        return 'b';
    }
}