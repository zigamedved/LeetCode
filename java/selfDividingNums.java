class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = left; i<=right; i++){
            if(check(i)){
                result.add(i);
            }
        }
        return result;
    }
    public boolean check(int num){
        int cpy=num;
        int mun=0;
        while(cpy>0){
            if(cpy%10==0)return false;
            mun*=10;
            mun+=cpy%10;
            cpy/=10;
        }
        while(mun>0){
            if(num%(mun%10)!=0){
                return false;
            }
            mun/=10;
        }
        return true;
    }
}