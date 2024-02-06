class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] tab = new int[(hi-lo)+1];
        int indeks=0;
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        
        for(int i = lo; i<=hi; i++){
            tab[indeks]=i;
            pairs.put(i,power(i));
            indeks++;
        }
        
        for (int i = 0; i < tab.length-1; i++){
            for (int j = 0; j < tab.length-i-1; j++) {
                if (pairs.get(tab[j]) > pairs.get(tab[j+1])){ 
                        int temp = tab[j]; 
                        tab[j] = tab[j+1]; 
                        tab[j+1] = temp; 
                }else if(pairs.get(tab[j]) == pairs.get(tab[j+1])){
                    if(tab[j]>tab[j+1]){
                        int temp = tab[j]; 
                        tab[j] = tab[j+1]; 
                        tab[j+1] = temp; 
                    }
                }
            }
        } 
        return tab[k-1];
    }
    
    private int power(int num){
        int steps=0;
        while(num!=1){
            if(num%2==0){
                num=num/2;
            }else{
                num=3*num+1;
            }
            steps++;
        }
        return steps;
    }
}