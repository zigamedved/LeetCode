class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] tab = str.split(" ");
        if(tab.length!=pattern.length())return false;
        HashMap<Character,String> map = new HashMap<Character,String>();
        char c;
        for(int i = 0; i<pattern.length(); i++){
            c=pattern.charAt(i);
            if(map.containsKey(c)){
               if(!(map.get(c)).equals(tab[i]))return false;
            }else{
                if(map.containsValue(tab[i]))return false; 
                map.put(c,tab[i]);
            }
        }
        return true;
    }
}