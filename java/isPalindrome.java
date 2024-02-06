class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        
        int y = x;
        int check=0;
        
        while(y>0){
            check=check*10 + y%10;
            y/=10;
        }
        
        return (check==x) ? true : false;
    }
}