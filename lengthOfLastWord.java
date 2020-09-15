class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null)return 0;
        int flag=0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)!=' '){
                flag=1;  
                break;
            }  
        }
        if(flag==0)return 0;
        String[] res = s.split(" ");
        return (res[res.length-1].length());
    }
}