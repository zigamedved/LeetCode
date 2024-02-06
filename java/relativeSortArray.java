class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int indeks=0;
        for(int i = 0;i<arr2.length;i++){
            int found=0;
            for(int j=0; j<arr1.length; j++){
                if(arr2[i]==arr1[j]){
                    result[indeks]=arr2[i];
                    indeks++;
                    arr1[j]=-1;
                }
            }
        }
        
        int x = 0; 
        int[] tab = new int[arr1.length];
        
        for(int i = 0; i<arr1.length;i++){
            if(arr1[i]!=-1){
                tab[x]=arr1[i];
                 x++;
            }
        }
        
        Arrays.sort(tab);
        
        for(int i = arr1.length-x;i<arr1.length;i++){
            result[indeks]=tab[i];
            indeks++;
        }
        
        return result;
    }
}