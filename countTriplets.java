class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        int first, second,third;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                for(int k = j+1; k<arr.length;k++){
                    first=Math.abs(arr[i]-arr[j]);
                    second=Math.abs(arr[j] - arr[k]);
                    third=Math.abs(arr[i] - arr[k]);
                    if(first<=a){
                        if(second<= b){
                            if(third<=c){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}