class Solution {
    public double average(int[] salary) {
        
        int min=salary[0];
        int max=salary[0];
        int sum=0;
        for(int i = 0; i<salary.length;i++){
            if(salary[i]<min)min=salary[i];
            if(salary[i]>max)max=salary[i];
            sum+=salary[i];
        }
        
        min+=max;
        sum-=min;
    
        return (double)sum/(salary.length-2);
    }
}