class Solution {
    public boolean isValid(String s) {
        Deque<Character> sklad = new ArrayDeque<Character>();
        
        if(s.length()==0)
            return true;
        if(s.length()%2!=0)
            return false;
        
        for(int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            
            if(a=='(' ){
                sklad.push(a);
            }else if(a=='['){
                sklad.push(a);
            }else if(a=='{'){
                sklad.push(a);
            }else if(!sklad.isEmpty()&&a==')'&& sklad.peek()=='('){
                sklad.pop();
            }else if(!sklad.isEmpty()&&a==']'&& sklad.peek()=='[' ){
                sklad.pop();
            }else if(!sklad.isEmpty()&&a=='}'&& sklad.peek()=='{'){
                sklad.pop();
            }else return false;
         }
        
        return sklad.isEmpty();
     }
}