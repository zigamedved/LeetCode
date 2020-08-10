class Solution {
    public int titleToNumber(String s) {
        int sum=0;
        char[] tab = s.toCharArray();
        char curr;
        int count = s.length()-1;
        int power;
        for(int i = 0; i<s.length();i++){
            if(i==s.length()-1){
                sum+=(char)(tab[i]-64);
                break;
            }
            curr = (char)(tab[i]-64);
            power =(int) Math.pow(26, count);
            sum+= (power*curr);
            count--;
        }
        
        return sum;
    }
}