class Solution {
    public int subtractProductAndSum(int n) {
        if(n==0)return 0;
        int sum=0;
        int product=1;
        int cpy=n;
        
        while(cpy>0){
            sum+=cpy%10;
            product*=cpy%10;
            cpy=cpy/10;
        }
        return product-sum;
    }
}