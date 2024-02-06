

int numberOfSteps (int num){
    int steps=0;
    
    while(num){
        if(num%2==0){
            num/=2;
            steps++;
        }else{
            num--;
            steps++;
        }
    }
    
    return steps;

}