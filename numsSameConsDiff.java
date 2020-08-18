class Solution {
    public int[] numsSameConsecDiff(int N, int K) {
        List<Integer> tab = new ArrayList<>();    
        
        
        if(N==1)tab.add(0);
    
        for(int i = 1; i<=9; i++){
         rek(N,1,K,i,tab);   
        }
        int[] res = new int[tab.size()];
        for(int i = 0; i<tab.size();i++){
            res[i]=tab.get(i);
        }
        
        
        return res;
    }
    
    public void rek(int N,int len,int K, int num,List<Integer> tab){
        if(N==len){
            tab.add(num);
            return;
        }
        
        int l = num%10;
        int digit=l+K;
        if(digit<=9){
            rek(N,len+1,K,num*10+digit,tab);
        }
        digit=l-K;
        if(K!=0 && digit>=0){
            rek(N,len+1,K,num*10+digit,tab);
        }
        
    }

}