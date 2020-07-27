class Solution {
    public int numJewelsInStones(String J, String S) {
        char a,b;
        int res=0;
        for(int i = 0; i<S.length();i++){
            a=S.charAt(i);
            for(int j = 0;j<J.length();j++){
                b=J.charAt(j);
                if(a==b)res++;
            }
        }
        return res;
    }
}