class Solution {
    public boolean checkValidString(String s) {
    int c1=0,c2=0;
    for(char i:s.toCharArray()){
        if(i=='('){
            c1++;
            c2++;
        }else if(i==')'){
            c1--;
            c2--;
        }else{
            c1++;
            c2--;
        }
    if(c1<0){
        return false;
    }
    c2=Math.max(c2,0);
    }
    return c2==0;
    }
}