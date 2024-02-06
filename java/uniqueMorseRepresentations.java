class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String, String> map = new HashMap<String, String>();
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char a;
        String current=null;
        for(int i = 0; i<words.length; i++){
            current=null;
            for(int j = 0; j<words[i].length(); j++){
               a=words[i].charAt(j);
                current=current+morse[a-'a'];
            }
            if(map.get(current)==null){
                map.put(current,"");
            }
        }
        return map.size();
    }
}