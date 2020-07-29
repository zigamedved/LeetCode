class Solution {
    public int balancedStringSplit(String s) {
        int count1=0;
        int count2=0;
        int result=0;
        char a,b;
        for(int i = 0; i<s.length();i+=2){
            a=s.charAt(i);
            b=s.charAt(i+1);
            if(a=='R'){
                count1++;
            }else{count2++;}
            
            if(b=='L'){
                count2++;
            }else{count1++;}
            
            if(count1==count2){
                count1=0;
                count2=0;
                result++;
            }else continue;
        }
        return result;
    }
}