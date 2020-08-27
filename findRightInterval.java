class Solution {
    public int[] findRightInterval(int[][] intervals) {
        if(intervals.length==1){
            int[] tab = {-1};   
            return tab;
        }
        
        int[] result = new int[intervals.length];
        for(int i = 0; i<result.length; i++){
            result[i]=-1;
        }
        
        int firstEnd,secondStart;
        int greater=-1;
        int equal=-1;
        
        for(int i = 0; i<intervals.length; i++){
            firstEnd=intervals[i][1];
            for(int j = 0; j<intervals.length; j++){
                if(i==j)continue;
                secondStart=intervals[j][0];
                if(firstEnd<secondStart){
                   greater=j;
                    break;
                }
            }
            for(int j = 0; j<intervals.length; j++){
                if(i==j)continue;
                secondStart=intervals[j][0];
                if(firstEnd==secondStart){
                   equal=j;
                    break;
                }
            }
            if(equal!=-1){
                result[i]=equal;
            }else{
                result[i]=greater;
            }
            equal=-1;
            greater=-1;
            
        }
        return result;
       
    }
}
