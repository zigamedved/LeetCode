
class Solution {
    public int[] tab=new int[50];
    public int fib(int N) {
        if(tab[N]!=0)return tab[N];
        if(N==1) return 1;
        if(N==0) return 0;
        
        tab[N]=fib(N-1)+fib(N-2);
        
        return tab[N];
    }
}